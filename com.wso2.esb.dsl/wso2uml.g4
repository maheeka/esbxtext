/*
 * Copyright (c) 2005-2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

grammar wso2uml;

/* --- PARSER RULES --- */

script
    : ( handler | NEWLINE )* EOF;

handler
    : STARTUMLX NEWLINE+
          statementList
      ENDUMLX ;

statementList
    : ( statement NEWLINE+ )* ;

statement
    : participantStatement
    | processingStatement
    | routingStatement
    | parallelStatement
    | ifStatement
    | loopStatement
    | groupStatement
    | refStatement
    ;


/* PARSER: built-in command rules */

participantStatement
    : integrationFlowDefStatement
    | inboundEndpointDefStatement
    | pipelineDefStatement
    | outboundEndpointDefStatement
    | mediatorDefStatement;
    
integrationFlowDefStatement
    : PARTICIPANT WS+ INTEGRATIONFLOWNAME WS+ COLON WS+ integrationFlowDef;
    
inboundEndpointDefStatement
    : PARTICIPANT WS+ INBOUNDENDPOINTNAME WS+ COLON WS+ inboundEndpointDef;

pipelineDefStatement
    : PARTICIPANT WS+ PIPELINENAME WS+ COLON WS+ pipelineDef;
    
outboundEndpointDefStatement
    : PARTICIPANT WS+ OUTBOUNDENDPOINTNAME WS+ COLON WS+ outboundEndpointDef;
    
mediatorDefStatement
    : PARTICIPANT WS+ MEDIATORNAME WS+ COLON WS+ mediatorDef;

processingStatement : processmessageDef;

integrationFlowDef: INTEGRATIONFLOWX LPAREN STRINGX RPAREN;

inboundEndpointDef: INBOUNDENDPOINTX LPAREN PROTOCOLDEF COMMA_SYMBOL PORTDEF COMMA_SYMBOL CONTEXTDEF RPAREN;

pipelineDef: PIPELINEX LPAREN STRINGX RPAREN;

mediatorDef: MEDIATORX LPAREN STRINGX RPAREN;

outboundEndpointDef: OUTBOUNDENDPOINTX LPAREN PROTOCOLDEF COMMA_SYMBOL HOSTDEF RPAREN;

processmessageDef: PROCESS_MESSAGEX LPAREN MEDIATORNAMESTRINGX COMMA_SYMBOL CONFIGSDEF RPAREN;
      
routingStatement
    : invokeFromSource 
    | invokeFromTarget
    | invokeToSource
    | invokeToTarget;

invokeFromSource: INBOUNDENDPOINTNAME WS+ ARROW WS+ PIPELINENAME WS+ COLON WS+ STRINGX;
invokeToTarget: PIPELINENAME WS+ ARROW WS+ OUTBOUNDENDPOINTNAME WS+ COLON WS+ STRINGX;
invokeFromTarget: OUTBOUNDENDPOINTNAME WS+ ARROW WS+ PIPELINENAME WS+ COLON WS+ STRINGX;
invokeToSource: PIPELINENAME WS+ ARROW WS+ INBOUNDENDPOINTNAME WS+ COLON WS+ STRINGX;

/* -> PAR block rules */

parallelStatement
    : PAR NEWLINE?
      NEWLINE parMultiThenBlock
      END
    ;

parMultiThenBlock
    : statementList NEWLINE (parElseBlock)? ;
    

parElseBlock
    : (ELSE NEWLINE statementList)+ ;

/* -> ALT block rules */

ifStatement
    : ALT WS expression NEWLINE
      NEWLINE? ifMultiThenBlock
      END
    ;

ifMultiThenBlock
    : statementList NEWLINE (ifElseBlock)? ;
    

ifElseBlock
    : (ELSE NEWLINE statementList)+ ;

/* -> GROUP block rules */
groupStatement
    : GROUP WS IDENTIFIER NEWLINE
      NEWLINE? statementList
      END
    ;
        
/* -> LOOP block rules */
loopStatement
    : LOOP WS expression NEWLINE
      NEWLINE? statementList
      END
    ;

refStatement
    : REF WS PIPELINENAME NEWLINE?;

expression
    : EXPRESSIONX;


/* --- LEXER rules --- */

/* LEXER: keyword rules */



PROTOCOLDEF: PROTOCOL LPAREN STRINGX RPAREN;

PORTDEF: PORT LPAREN NUMBER RPAREN;

CONTEXTDEF: CONTEXT LPAREN URLSTRINGX RPAREN;

HOSTDEF: HOST LPAREN URLSTRINGX RPAREN;

//PROCESSMESSAGEDEF: PROCESS_MESSAGE LPAREN MEDIATORNAMESTRINGX COMMA_SYMBOL CONFIGSDEF RPAREN;

CONFIGSDEF: CONFIGS LPAREN (CONFIGPARAMS COMMA_SYMBOL)* (CONFIGPARAMS)* RPAREN;

EXPRESSIONX: EXPRESSION;

TIMEOUTDEF: TIMEOUT LPAREN NUMBER RPAREN;

INTEGRATIONFLOWX: INTEGRATIONFLOW;
INBOUNDENDPOINTX: INBOUNDENDPOINT;
PIPELINEX: PIPELINE;
MEDIATORX: MEDIATOR;
OUTBOUNDENDPOINTX: OUTBOUNDENDPOINT;
PROCESS_MESSAGEX: PROCESS_MESSAGE;
//PROTOCOLX: PROTOCOL;
//PORTX: PORT;
//CONTEXTX: CONTEXT;
//HOSTX: HOST;
//TIMEOUTX: TIMEOUT;
//CONFIGSX: CONFIGS;
//CONFIGPARAMSX: CONFIGPARAMS;

MEDIATORNAMESTRINGX: MEDIATORNAMESTRING;
STRINGX: STRING;
URLSTRINGX: URLSTRING;


fragment STRING: DOUBLEQUOTES IDENTIFIER DOUBLEQUOTES;
fragment URLSTRING: DOUBLEQUOTES URL DOUBLEQUOTES;
fragment MEDIATORNAMESTRING: DOUBLEQUOTES MEDIATORNAME DOUBLEQUOTES;
fragment EXPRESSION: LPAREN CONFIGPARAMS RPAREN;


//FLOWCOMMENT: DOUBLEQUOTES IDENTIFIER DOUBLEQUOTES;

INTEGRATIONFLOWNAME: INTEGRATIONFLOW IDENTIFIER;

MEDIATORNAME: CALL | FILTER | RESPOND;

INBOUNDENDPOINTNAME: INBOUNDENDPOINT IDENTIFIER;

PIPELINENAME: PIPELINE IDENTIFIER;

OUTBOUNDENDPOINTNAME: OUTBOUNDENDPOINT IDENTIFIER;

AND : A N D ;
DIV : D I V ;
DO : D O ;
DOWN : D O W N ;
EXIT: E X I T ;
FOR: F O R ;
FOREVER : F O R E V E R ;
FUNCTION : F U N C T I O N ;
GLOBAL : G L O B A L ;
HYPERCARD : H Y P E R C A R D ;
IF : I F ;
IS : I S ;
MOD : M O D ;
NEXT : N E X T ;
NOT : N O T ;
ON : O N ;
OR : O R ;
REPEAT : R E P E A T ;
THEN : T H E N ;
TIMES : T I M E S ;
TO : T O ;
UNTIL : U N T I L ;
WITH : W I T H ;
WHILE : W H I L E ;

/* TYPES */

STARTUMLX: STARTUML;
ENDUMLX: ENDUML;

fragment STARTUML: '@startuml';
fragment ENDUML: '@enduml';

PARTICIPANT: P A R T I C I P A N T;

PAR: P A R;
ALT: A L T;
REF: R E F;
END: E N D;
ELSE: E L S E;
LOOP: L O O P;
GROUP: G R O U P;




ACTOR: A C T O R;
USECASE: U S E C A S E;
CLASS: C L A S S;
INTERFACE: I N T E R F A C E;
ABSTRACT: A B S T R A C T;
ENUM: E N U M;
COMPONENT: C O M P O N E N T;
STATE: S T A T E;
OBJECT: O B J E C T;
ARTIFACT: A R T I F A C T;
FOLDER : F O L D E R;
RECT: R E C T;
NODE: N O D E;
FRAME: F R A M E;
CLOUD: C L O U D;
DATABASE: D A T A B A S E;
STORAGE: S T O R A G E; 
AGENT: A G E N T;
BOUNDARY: B O U N D A R Y;
CONTROL: C O N T R O L;
ENTITY: E N T I T Y; 
CARD: C A R D;


/* LEXER: symbol rules */

AMP_SYMBOL : '&' ;
AMPAMP_SYMBOL : '&&' ;
CARET_SYMBOL : '^' ;
COMMA_SYMBOL : ',' ;
COMMENT_SYMBOL : '--' ;
CONTINUATION_SYMBOL : '\\' | '\u00AC' ;
EQ_SYMBOL : '=' ;
GE_SYMBOL : '>=' | '\u2265' ;
GT_SYMBOL : '>' ;
LE_SYMBOL : '<=' | '\u2264' ;
LT_SYMBOL : '<' ;
MINUS_SYMBOL : '-' ;
NE_SYMBOL : '<>' | '\u2260';
PLUS_SYMBOL : '+' ;
STAR_SYMBOL : '*' ;
SLASH_SYMBOL : '/' ;
UNDERSCORE : '-';

COLON: ':';
ARROW: '->';
fragment DOUBLEQUOTES: '"';
SINGLEQUOTES: '\'';

/* LEXER: miscellanea */

LPAREN : '(' ;
RPAREN : ')' ;

NEWLINE
    : ( '\r\n' | '\n' | '\r' ) ;

WS
    : ' ';

IDENTIFIER
    : ( 'a'..'z' | 'A'..'Z' ) ( 'a'..'z' | 'A'..'Z' | DIGIT | '_')* ;

fragment CONFIGPARAMS: ([a-zA-Z\?] | COLON | [0-9] | '$' | '.' | '@' | SINGLEQUOTES | DOUBLEQUOTES | '{' | '}' | AMP_SYMBOL | AMPAMP_SYMBOL | CARET_SYMBOL | COMMA_SYMBOL | COMMENT_SYMBOL | CONTINUATION_SYMBOL | EQ_SYMBOL | GE_SYMBOL | GT_SYMBOL | LE_SYMBOL | LT_SYMBOL | MINUS_SYMBOL | NE_SYMBOL | PLUS_SYMBOL | STAR_SYMBOL | SLASH_SYMBOL )+;

NUMBER 
    : ( '0' | '1'..'9' DIGIT*) ('.' DIGIT+ )? ;

URL: ([a-zA-Z/\?&] | COLON | [0-9])+;

COMMENT
    : COMMENT_SYMBOL ~[\r\n]* -> skip ;
CONTINUATION
    : CONTINUATION_SYMBOL ~[\r\n]* NEWLINE -> skip ;


WHITESPACE
    : [ \t]+ -> skip ;

/* LEXER: fragments */

fragment DIGIT : '0'..'9' ;

fragment INTEGRATIONFLOW: I N T E G R A T I O N F L O W;
fragment INBOUNDENDPOINT: I N B O U N D E N D P O I N T;
fragment HTTP: H T T P;
fragment PIPELINE: P I P E L I N E;
fragment PROCESSMESSAGE: P R O C E S S M E S S A G E;
fragment OUTBOUNDENDPOINT: O U T B O U N D E N D P O I N T ;
fragment MEDIATOR: M E D I A T O R;
fragment PROTOCOL: P R O T O C O L;
fragment PORT: P O R T;
fragment ENDPOINT: E N D P O I N T;
fragment CONTEXT: C O N T E X T;
fragment TIMEOUT: T I M E O U T;
fragment HOST: H O S T;
fragment CONFIGS: C O N F I G S;
fragment PROCESS_MESSAGE: 'process_message';

fragment CALL: C A L L;
fragment FILTER: F I L T E R;
fragment RESPOND: R E S P O N D;
fragment LOG: L O G;
fragment ENRICH: E N R I C H;
fragment TRANS: T R A N S;
/* case insensitive lexer matching */
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

