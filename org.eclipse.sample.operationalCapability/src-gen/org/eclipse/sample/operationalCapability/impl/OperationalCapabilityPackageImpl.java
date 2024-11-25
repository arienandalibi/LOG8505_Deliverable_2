/**
 */
package org.eclipse.sample.operationalCapability.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sample.operationalCapability.Actor;
import org.eclipse.sample.operationalCapability.CapabilityDiagram;
import org.eclipse.sample.operationalCapability.Capabilty;
import org.eclipse.sample.operationalCapability.Entity;
import org.eclipse.sample.operationalCapability.InvolvableElement;
import org.eclipse.sample.operationalCapability.OperationalCapabilityFactory;
import org.eclipse.sample.operationalCapability.OperationalCapabilityPackage;
import org.eclipse.sample.operationalCapability.SpecializableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationalCapabilityPackageImpl extends EPackageImpl implements OperationalCapabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabiltyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass involvableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperationalCapabilityPackageImpl() {
		super(eNS_URI, OperationalCapabilityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OperationalCapabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OperationalCapabilityPackage init() {
		if (isInited)
			return (OperationalCapabilityPackage) EPackage.Registry.INSTANCE
					.getEPackage(OperationalCapabilityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOperationalCapabilityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OperationalCapabilityPackageImpl theOperationalCapabilityPackage = registeredOperationalCapabilityPackage instanceof OperationalCapabilityPackageImpl
				? (OperationalCapabilityPackageImpl) registeredOperationalCapabilityPackage
				: new OperationalCapabilityPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOperationalCapabilityPackage.createPackageContents();

		// Initialize created meta-data
		theOperationalCapabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperationalCapabilityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OperationalCapabilityPackage.eNS_URI, theOperationalCapabilityPackage);
		return theOperationalCapabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilty() {
		return capabiltyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilty_Involves() {
		return (EReference) capabiltyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilty_Extends() {
		return (EReference) capabiltyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilty_IsExtendedBy() {
		return (EReference) capabiltyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilty_Includes() {
		return (EReference) capabiltyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilty_IsIncludedIn() {
		return (EReference) capabiltyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecializableElement() {
		return specializableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecializableElement_Specializes() {
		return (EReference) specializableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecializableElement_IsSpecializedBy() {
		return (EReference) specializableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityDiagram() {
		return capabilityDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityDiagram_Elements() {
		return (EReference) capabilityDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvolvableElement() {
		return involvableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvolvableElement_IsInvolvedIn() {
		return (EReference) involvableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapabilityFactory getOperationalCapabilityFactory() {
		return (OperationalCapabilityFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		capabiltyEClass = createEClass(CAPABILTY);
		createEReference(capabiltyEClass, CAPABILTY__INVOLVES);
		createEReference(capabiltyEClass, CAPABILTY__EXTENDS);
		createEReference(capabiltyEClass, CAPABILTY__IS_EXTENDED_BY);
		createEReference(capabiltyEClass, CAPABILTY__INCLUDES);
		createEReference(capabiltyEClass, CAPABILTY__IS_INCLUDED_IN);

		specializableElementEClass = createEClass(SPECIALIZABLE_ELEMENT);
		createEReference(specializableElementEClass, SPECIALIZABLE_ELEMENT__SPECIALIZES);
		createEReference(specializableElementEClass, SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY);

		capabilityDiagramEClass = createEClass(CAPABILITY_DIAGRAM);
		createEReference(capabilityDiagramEClass, CAPABILITY_DIAGRAM__ELEMENTS);

		involvableElementEClass = createEClass(INVOLVABLE_ELEMENT);
		createEReference(involvableElementEClass, INVOLVABLE_ELEMENT__IS_INVOLVED_IN);

		actorEClass = createEClass(ACTOR);

		entityEClass = createEClass(ENTITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		capabiltyEClass.getESuperTypes().add(this.getSpecializableElement());
		involvableElementEClass.getESuperTypes().add(this.getSpecializableElement());
		actorEClass.getESuperTypes().add(this.getInvolvableElement());
		entityEClass.getESuperTypes().add(this.getInvolvableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(capabiltyEClass, Capabilty.class, "Capabilty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilty_Involves(), this.getInvolvableElement(), this.getInvolvableElement_IsInvolvedIn(),
				"involves", null, 1, -1, Capabilty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilty_Extends(), this.getCapabilty(), this.getCapabilty_IsExtendedBy(), "extends", null,
				0, 1, Capabilty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilty_IsExtendedBy(), this.getCapabilty(), this.getCapabilty_Extends(), "isExtendedBy",
				null, 0, -1, Capabilty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilty_Includes(), this.getCapabilty(), this.getCapabilty_IsIncludedIn(), "includes", null,
				0, -1, Capabilty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilty_IsIncludedIn(), this.getCapabilty(), this.getCapabilty_Includes(), "isIncludedIn",
				null, 0, 1, Capabilty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specializableElementEClass, SpecializableElement.class, "SpecializableElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecializableElement_Specializes(), this.getSpecializableElement(),
				this.getSpecializableElement_IsSpecializedBy(), "specializes", null, 0, 1, SpecializableElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecializableElement_IsSpecializedBy(), this.getSpecializableElement(),
				this.getSpecializableElement_Specializes(), "isSpecializedBy", null, 0, 1, SpecializableElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityDiagramEClass, CapabilityDiagram.class, "CapabilityDiagram", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityDiagram_Elements(), this.getSpecializableElement(), null, "elements", null, 0, -1,
				CapabilityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(involvableElementEClass, InvolvableElement.class, "InvolvableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvolvableElement_IsInvolvedIn(), this.getCapabilty(), this.getCapabilty_Involves(),
				"isInvolvedIn", null, 1, -1, InvolvableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OperationalCapabilityPackageImpl
