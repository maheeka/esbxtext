/*
 * generated by Xtext 2.9.0
 */
package com.wso2.esb.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EsbDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/wso2/esb/dsl/parser/antlr/internal/InternalEsbDsl.tokens");
	}
}
