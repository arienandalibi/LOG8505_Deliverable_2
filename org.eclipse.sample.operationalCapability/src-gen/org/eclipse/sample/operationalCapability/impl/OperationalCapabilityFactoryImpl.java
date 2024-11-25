/**
 */
package org.eclipse.sample.operationalCapability.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sample.operationalCapability.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationalCapabilityFactoryImpl extends EFactoryImpl implements OperationalCapabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationalCapabilityFactory init() {
		try {
			OperationalCapabilityFactory theOperationalCapabilityFactory = (OperationalCapabilityFactory) EPackage.Registry.INSTANCE
					.getEFactory(OperationalCapabilityPackage.eNS_URI);
			if (theOperationalCapabilityFactory != null) {
				return theOperationalCapabilityFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationalCapabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapabilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case OperationalCapabilityPackage.CAPABILTY:
			return createCapabilty();
		case OperationalCapabilityPackage.CAPABILITY_DIAGRAM:
			return createCapabilityDiagram();
		case OperationalCapabilityPackage.ACTOR:
			return createActor();
		case OperationalCapabilityPackage.ENTITY:
			return createEntity();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilty createCapabilty() {
		CapabiltyImpl capabilty = new CapabiltyImpl();
		return capabilty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityDiagram createCapabilityDiagram() {
		CapabilityDiagramImpl capabilityDiagram = new CapabilityDiagramImpl();
		return capabilityDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapabilityPackage getOperationalCapabilityPackage() {
		return (OperationalCapabilityPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationalCapabilityPackage getPackage() {
		return OperationalCapabilityPackage.eINSTANCE;
	}

} //OperationalCapabilityFactoryImpl
