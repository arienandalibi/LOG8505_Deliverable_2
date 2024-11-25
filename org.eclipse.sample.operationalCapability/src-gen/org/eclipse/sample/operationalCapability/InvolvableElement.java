/**
 */
package org.eclipse.sample.operationalCapability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Involvable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.operationalCapability.InvolvableElement#getIsInvolvedIn <em>Is Involved In</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getInvolvableElement()
 * @model abstract="true"
 * @generated
 */
public interface InvolvableElement extends SpecializableElement {
	/**
	 * Returns the value of the '<em><b>Is Involved In</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sample.operationalCapability.Capabilty}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sample.operationalCapability.Capabilty#getInvolves <em>Involves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Involved In</em>' reference list.
	 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getInvolvableElement_IsInvolvedIn()
	 * @see org.eclipse.sample.operationalCapability.Capabilty#getInvolves
	 * @model opposite="involves" required="true"
	 * @generated
	 */
	EList<Capabilty> getIsInvolvedIn();

} // InvolvableElement
