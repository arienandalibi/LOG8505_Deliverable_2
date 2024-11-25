/**
 */
package org.eclipse.sample.operationalCapability;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityFactory
 * @model kind="package"
 * @generated
 */
public interface OperationalCapabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "operationalCapability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/operationalCapability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "operationalCapability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationalCapabilityPackage eINSTANCE = org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sample.operationalCapability.impl.SpecializableElementImpl <em>Specializable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.operationalCapability.impl.SpecializableElementImpl
	 * @see org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl#getSpecializableElement()
	 * @generated
	 */
	int SPECIALIZABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT__SPECIALIZES = 0;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY = 1;

	/**
	 * The number of structural features of the '<em>Specializable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specializable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sample.operationalCapability.impl.CapabiltyImpl <em>Capabilty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.operationalCapability.impl.CapabiltyImpl
	 * @see org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl#getCapabilty()
	 * @generated
	 */
	int CAPABILTY = 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILTY__SPECIALIZES = SPECIALIZABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILTY__IS_SPECIALIZED_BY = SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Involves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILTY__INVOLVES = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILTY__EXTENDS = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Extended By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILTY__IS_EXTENDED_BY = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILTY__INCLUDES = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Included In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILTY__IS_INCLUDED_IN = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILTY__NAME = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Capabilty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILTY_FEATURE_COUNT = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Capabilty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILTY_OPERATION_COUNT = SPECIALIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sample.operationalCapability.impl.CapabilityDiagramImpl <em>Capability Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.operationalCapability.impl.CapabilityDiagramImpl
	 * @see org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl#getCapabilityDiagram()
	 * @generated
	 */
	int CAPABILITY_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DIAGRAM__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Capability Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capability Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sample.operationalCapability.impl.InvolvableElementImpl <em>Involvable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.operationalCapability.impl.InvolvableElementImpl
	 * @see org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl#getInvolvableElement()
	 * @generated
	 */
	int INVOLVABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__SPECIALIZES = SPECIALIZABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__IS_SPECIALIZED_BY = SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Is Involved In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__IS_INVOLVED_IN = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Involvable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT_FEATURE_COUNT = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Involvable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT_OPERATION_COUNT = SPECIALIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sample.operationalCapability.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.operationalCapability.impl.ActorImpl
	 * @see org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 4;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SPECIALIZES = INVOLVABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_SPECIALIZED_BY = INVOLVABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Is Involved In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_INVOLVED_IN = INVOLVABLE_ELEMENT__IS_INVOLVED_IN;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = INVOLVABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = INVOLVABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sample.operationalCapability.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.operationalCapability.impl.EntityImpl
	 * @see org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SPECIALIZES = INVOLVABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_SPECIALIZED_BY = INVOLVABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Is Involved In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_INVOLVED_IN = INVOLVABLE_ELEMENT__IS_INVOLVED_IN;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = INVOLVABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = INVOLVABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.operationalCapability.Capabilty <em>Capabilty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilty</em>'.
	 * @see org.eclipse.sample.operationalCapability.Capabilty
	 * @generated
	 */
	EClass getCapabilty();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sample.operationalCapability.Capabilty#getInvolves <em>Involves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involves</em>'.
	 * @see org.eclipse.sample.operationalCapability.Capabilty#getInvolves()
	 * @see #getCapabilty()
	 * @generated
	 */
	EReference getCapabilty_Involves();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sample.operationalCapability.Capabilty#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see org.eclipse.sample.operationalCapability.Capabilty#getExtends()
	 * @see #getCapabilty()
	 * @generated
	 */
	EReference getCapabilty_Extends();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sample.operationalCapability.Capabilty#getIsExtendedBy <em>Is Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Extended By</em>'.
	 * @see org.eclipse.sample.operationalCapability.Capabilty#getIsExtendedBy()
	 * @see #getCapabilty()
	 * @generated
	 */
	EReference getCapabilty_IsExtendedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sample.operationalCapability.Capabilty#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see org.eclipse.sample.operationalCapability.Capabilty#getIncludes()
	 * @see #getCapabilty()
	 * @generated
	 */
	EReference getCapabilty_Includes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sample.operationalCapability.Capabilty#getIsIncludedIn <em>Is Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Included In</em>'.
	 * @see org.eclipse.sample.operationalCapability.Capabilty#getIsIncludedIn()
	 * @see #getCapabilty()
	 * @generated
	 */
	EReference getCapabilty_IsIncludedIn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sample.operationalCapability.Capabilty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sample.operationalCapability.Capabilty#getName()
	 * @see #getCapabilty()
	 * @generated
	 */
	EAttribute getCapabilty_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.operationalCapability.SpecializableElement <em>Specializable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specializable Element</em>'.
	 * @see org.eclipse.sample.operationalCapability.SpecializableElement
	 * @generated
	 */
	EClass getSpecializableElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sample.operationalCapability.SpecializableElement#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes</em>'.
	 * @see org.eclipse.sample.operationalCapability.SpecializableElement#getSpecializes()
	 * @see #getSpecializableElement()
	 * @generated
	 */
	EReference getSpecializableElement_Specializes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sample.operationalCapability.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Specialized By</em>'.
	 * @see org.eclipse.sample.operationalCapability.SpecializableElement#getIsSpecializedBy()
	 * @see #getSpecializableElement()
	 * @generated
	 */
	EReference getSpecializableElement_IsSpecializedBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.operationalCapability.CapabilityDiagram <em>Capability Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Diagram</em>'.
	 * @see org.eclipse.sample.operationalCapability.CapabilityDiagram
	 * @generated
	 */
	EClass getCapabilityDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sample.operationalCapability.CapabilityDiagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.sample.operationalCapability.CapabilityDiagram#getElements()
	 * @see #getCapabilityDiagram()
	 * @generated
	 */
	EReference getCapabilityDiagram_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.operationalCapability.InvolvableElement <em>Involvable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Involvable Element</em>'.
	 * @see org.eclipse.sample.operationalCapability.InvolvableElement
	 * @generated
	 */
	EClass getInvolvableElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sample.operationalCapability.InvolvableElement#getIsInvolvedIn <em>Is Involved In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Involved In</em>'.
	 * @see org.eclipse.sample.operationalCapability.InvolvableElement#getIsInvolvedIn()
	 * @see #getInvolvableElement()
	 * @generated
	 */
	EReference getInvolvableElement_IsInvolvedIn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.operationalCapability.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.eclipse.sample.operationalCapability.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.operationalCapability.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.eclipse.sample.operationalCapability.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperationalCapabilityFactory getOperationalCapabilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sample.operationalCapability.impl.CapabiltyImpl <em>Capabilty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.operationalCapability.impl.CapabiltyImpl
		 * @see org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl#getCapabilty()
		 * @generated
		 */
		EClass CAPABILTY = eINSTANCE.getCapabilty();

		/**
		 * The meta object literal for the '<em><b>Involves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILTY__INVOLVES = eINSTANCE.getCapabilty_Involves();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILTY__EXTENDS = eINSTANCE.getCapabilty_Extends();

		/**
		 * The meta object literal for the '<em><b>Is Extended By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILTY__IS_EXTENDED_BY = eINSTANCE.getCapabilty_IsExtendedBy();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILTY__INCLUDES = eINSTANCE.getCapabilty_Includes();

		/**
		 * The meta object literal for the '<em><b>Is Included In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILTY__IS_INCLUDED_IN = eINSTANCE.getCapabilty_IsIncludedIn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILTY__NAME = eINSTANCE.getCapabilty_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.operationalCapability.impl.SpecializableElementImpl <em>Specializable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.operationalCapability.impl.SpecializableElementImpl
		 * @see org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl#getSpecializableElement()
		 * @generated
		 */
		EClass SPECIALIZABLE_ELEMENT = eINSTANCE.getSpecializableElement();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZABLE_ELEMENT__SPECIALIZES = eINSTANCE.getSpecializableElement_Specializes();

		/**
		 * The meta object literal for the '<em><b>Is Specialized By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY = eINSTANCE.getSpecializableElement_IsSpecializedBy();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.operationalCapability.impl.CapabilityDiagramImpl <em>Capability Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.operationalCapability.impl.CapabilityDiagramImpl
		 * @see org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl#getCapabilityDiagram()
		 * @generated
		 */
		EClass CAPABILITY_DIAGRAM = eINSTANCE.getCapabilityDiagram();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_DIAGRAM__ELEMENTS = eINSTANCE.getCapabilityDiagram_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.operationalCapability.impl.InvolvableElementImpl <em>Involvable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.operationalCapability.impl.InvolvableElementImpl
		 * @see org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl#getInvolvableElement()
		 * @generated
		 */
		EClass INVOLVABLE_ELEMENT = eINSTANCE.getInvolvableElement();

		/**
		 * The meta object literal for the '<em><b>Is Involved In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOLVABLE_ELEMENT__IS_INVOLVED_IN = eINSTANCE.getInvolvableElement_IsInvolvedIn();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.operationalCapability.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.operationalCapability.impl.ActorImpl
		 * @see org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.operationalCapability.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.operationalCapability.impl.EntityImpl
		 * @see org.eclipse.sample.operationalCapability.impl.OperationalCapabilityPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

	}

} //OperationalCapabilityPackage
