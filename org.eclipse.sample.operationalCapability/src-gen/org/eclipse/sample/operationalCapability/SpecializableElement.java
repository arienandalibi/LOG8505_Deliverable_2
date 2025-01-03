/**
 */
package org.eclipse.sample.operationalCapability;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specializable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.operationalCapability.SpecializableElement#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.eclipse.sample.operationalCapability.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}</li>
 *   <li>{@link org.eclipse.sample.operationalCapability.SpecializableElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getSpecializableElement()
 * @model abstract="true"
 * @generated
 */
public interface SpecializableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sample.operationalCapability.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference.
	 * @see #setSpecializes(SpecializableElement)
	 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getSpecializableElement_Specializes()
	 * @see org.eclipse.sample.operationalCapability.SpecializableElement#getIsSpecializedBy
	 * @model opposite="isSpecializedBy"
	 * @generated
	 */
	SpecializableElement getSpecializes();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.operationalCapability.SpecializableElement#getSpecializes <em>Specializes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializes</em>' reference.
	 * @see #getSpecializes()
	 * @generated
	 */
	void setSpecializes(SpecializableElement value);

	/**
	 * Returns the value of the '<em><b>Is Specialized By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sample.operationalCapability.SpecializableElement#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Specialized By</em>' reference.
	 * @see #setIsSpecializedBy(SpecializableElement)
	 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getSpecializableElement_IsSpecializedBy()
	 * @see org.eclipse.sample.operationalCapability.SpecializableElement#getSpecializes
	 * @model opposite="specializes"
	 * @generated
	 */
	SpecializableElement getIsSpecializedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.operationalCapability.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Specialized By</em>' reference.
	 * @see #getIsSpecializedBy()
	 * @generated
	 */
	void setIsSpecializedBy(SpecializableElement value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getSpecializableElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.operationalCapability.SpecializableElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SpecializableElement
