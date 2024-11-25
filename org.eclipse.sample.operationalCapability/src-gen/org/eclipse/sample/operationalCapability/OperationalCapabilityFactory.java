/**
 */
package org.eclipse.sample.operationalCapability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage
 * @generated
 */
public interface OperationalCapabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationalCapabilityFactory eINSTANCE = org.eclipse.sample.operationalCapability.impl.OperationalCapabilityFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Capabilty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capabilty</em>'.
	 * @generated
	 */
	Capabilty createCapabilty();

	/**
	 * Returns a new object of class '<em>Capability Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Diagram</em>'.
	 * @generated
	 */
	CapabilityDiagram createCapabilityDiagram();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OperationalCapabilityPackage getOperationalCapabilityPackage();

} //OperationalCapabilityFactory
