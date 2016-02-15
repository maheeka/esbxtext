/**
 * generated by Xtext 2.9.0
 */
package com.wso2.esb.dsl.esbDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wso2.esb.dsl.esbDsl.Model#getParticipants <em>Participants</em>}</li>
 *   <li>{@link com.wso2.esb.dsl.esbDsl.Model#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see com.wso2.esb.dsl.esbDsl.EsbDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
   * The list contents are of type {@link com.wso2.esb.dsl.esbDsl.ParticipantStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Participants</em>' containment reference list.
   * @see com.wso2.esb.dsl.esbDsl.EsbDslPackage#getModel_Participants()
   * @model containment="true"
   * @generated
   */
  EList<ParticipantStatement> getParticipants();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link com.wso2.esb.dsl.esbDsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see com.wso2.esb.dsl.esbDsl.EsbDslPackage#getModel_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Model
