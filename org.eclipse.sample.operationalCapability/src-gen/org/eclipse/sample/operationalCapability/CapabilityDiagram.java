/**
 */
package org.eclipse.sample.operationalCapability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.operationalCapability.CapabilityDiagram#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getCapabilityDiagram()
 * @model
 * @generated
 */
public interface CapabilityDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sample.operationalCapability.SpecializableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage#getCapabilityDiagram_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecializableElement> getElements();

} // CapabilityDiagram
