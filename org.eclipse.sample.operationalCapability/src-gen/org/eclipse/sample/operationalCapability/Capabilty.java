/**
 */
package org.eclipse.sample.operationalCapability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capabilty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.operationalCapability.Capabilty#getInvolves <em>Involves</em>}</li>
 *   <li>{@link org.eclipse.sample.operationalCapability.Capabilty#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.sample.operationalCapability.Capabilty#getIsExtendedBy <em>Is Extended By</em>}</li>
 *   <li>{@link org.eclipse.sample.operationalCapability.Capabilty#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.eclipse.sample.operationalCapability.Capabilty#getIsIncludedIn <em>Is Included In</em>}</li>
 *   <li>{@link org.eclipse.sample.operationalCapability.Capabilty#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getCapabilty()
 * @model
 * @generated
 */
public interface Capabilty extends SpecializableElement {
	/**
	 * Returns the value of the '<em><b>Involves</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sample.operationalCapability.InvolvableElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sample.operationalCapability.InvolvableElement#getIsInvolvedIn <em>Is Involved In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involves</em>' reference list.
	 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getCapabilty_Involves()
	 * @see org.eclipse.sample.operationalCapability.InvolvableElement#getIsInvolvedIn
	 * @model opposite="isInvolvedIn" required="true"
	 * @generated
	 */
	EList<InvolvableElement> getInvolves();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sample.operationalCapability.Capabilty#getIsExtendedBy <em>Is Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Capabilty)
	 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getCapabilty_Extends()
	 * @see org.eclipse.sample.operationalCapability.Capabilty#getIsExtendedBy
	 * @model opposite="isExtendedBy"
	 * @generated
	 */
	Capabilty getExtends();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.operationalCapability.Capabilty#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Capabilty value);

	/**
	 * Returns the value of the '<em><b>Is Extended By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sample.operationalCapability.Capabilty}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sample.operationalCapability.Capabilty#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extended By</em>' reference list.
	 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getCapabilty_IsExtendedBy()
	 * @see org.eclipse.sample.operationalCapability.Capabilty#getExtends
	 * @model opposite="extends"
	 * @generated
	 */
	EList<Capabilty> getIsExtendedBy();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sample.operationalCapability.Capabilty}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sample.operationalCapability.Capabilty#getIsIncludedIn <em>Is Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getCapabilty_Includes()
	 * @see org.eclipse.sample.operationalCapability.Capabilty#getIsIncludedIn
	 * @model opposite="isIncludedIn"
	 * @generated
	 */
	EList<Capabilty> getIncludes();

	/**
	 * Returns the value of the '<em><b>Is Included In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sample.operationalCapability.Capabilty#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Included In</em>' reference.
	 * @see #setIsIncludedIn(Capabilty)
	 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getCapabilty_IsIncludedIn()
	 * @see org.eclipse.sample.operationalCapability.Capabilty#getIncludes
	 * @model opposite="includes"
	 * @generated
	 */
	Capabilty getIsIncludedIn();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.operationalCapability.Capabilty#getIsIncludedIn <em>Is Included In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Included In</em>' reference.
	 * @see #getIsIncludedIn()
	 * @generated
	 */
	void setIsIncludedIn(Capabilty value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getCapabilty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.operationalCapability.Capabilty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Capabilty
