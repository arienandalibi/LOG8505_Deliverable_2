/**
 */
package org.eclipse.sample.operationalCapability.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.sample.operationalCapability.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.sample.operationalCapability.OperationalCapabilityPackage
 * @generated
 */
public class OperationalCapabilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperationalCapabilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapabilitySwitch() {
		if (modelPackage == null) {
			modelPackage = OperationalCapabilityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case OperationalCapabilityPackage.CAPABILTY: {
			Capabilty capabilty = (Capabilty) theEObject;
			T result = caseCapabilty(capabilty);
			if (result == null)
				result = caseSpecializableElement(capabilty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OperationalCapabilityPackage.SPECIALIZABLE_ELEMENT: {
			SpecializableElement specializableElement = (SpecializableElement) theEObject;
			T result = caseSpecializableElement(specializableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OperationalCapabilityPackage.CAPABILITY_DIAGRAM: {
			CapabilityDiagram capabilityDiagram = (CapabilityDiagram) theEObject;
			T result = caseCapabilityDiagram(capabilityDiagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OperationalCapabilityPackage.INVOLVABLE_ELEMENT: {
			InvolvableElement involvableElement = (InvolvableElement) theEObject;
			T result = caseInvolvableElement(involvableElement);
			if (result == null)
				result = caseSpecializableElement(involvableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OperationalCapabilityPackage.ACTOR: {
			Actor actor = (Actor) theEObject;
			T result = caseActor(actor);
			if (result == null)
				result = caseInvolvableElement(actor);
			if (result == null)
				result = caseSpecializableElement(actor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OperationalCapabilityPackage.ENTITY: {
			Entity entity = (Entity) theEObject;
			T result = caseEntity(entity);
			if (result == null)
				result = caseInvolvableElement(entity);
			if (result == null)
				result = caseSpecializableElement(entity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capabilty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capabilty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilty(Capabilty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specializable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specializable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecializableElement(SpecializableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityDiagram(CapabilityDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Involvable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Involvable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvolvableElement(InvolvableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OperationalCapabilitySwitch
