/**
 * generated by Xtext 2.9.0
 */
package com.wso2.esb.dsl.esbDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inbound Endpoint Def Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wso2.esb.dsl.esbDsl.InboundEndpointDefStatement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.wso2.esb.dsl.esbDsl.EsbDslPackage#getInboundEndpointDefStatement()
 * @model
 * @generated
 */
public interface InboundEndpointDefStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.wso2.esb.dsl.esbDsl.EsbDslPackage#getInboundEndpointDefStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.wso2.esb.dsl.esbDsl.InboundEndpointDefStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // InboundEndpointDefStatement
