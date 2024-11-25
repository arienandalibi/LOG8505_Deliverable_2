/**
 */
package org.eclipse.sample.operationalCapability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sample.operationalCapability.Capabilty;
import org.eclipse.sample.operationalCapability.InvolvableElement;
import org.eclipse.sample.operationalCapability.OperationalCapabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Involvable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.operationalCapability.impl.InvolvableElementImpl#getIsInvolvedIn <em>Is Involved In</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InvolvableElementImpl extends SpecializableElementImpl implements InvolvableElement {
	/**
	 * The cached value of the '{@link #getIsInvolvedIn() <em>Is Involved In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInvolvedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Capabilty> isInvolvedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvolvableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalCapabilityPackage.Literals.INVOLVABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capabilty> getIsInvolvedIn() {
		if (isInvolvedIn == null) {
			isInvolvedIn = new EObjectWithInverseResolvingEList.ManyInverse<Capabilty>(Capabilty.class, this,
					OperationalCapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN,
					OperationalCapabilityPackage.CAPABILTY__INVOLVES);
		}
		return isInvolvedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OperationalCapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsInvolvedIn()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OperationalCapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			return ((InternalEList<?>) getIsInvolvedIn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OperationalCapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			return getIsInvolvedIn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OperationalCapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			getIsInvolvedIn().clear();
			getIsInvolvedIn().addAll((Collection<? extends Capabilty>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case OperationalCapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			getIsInvolvedIn().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case OperationalCapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			return isInvolvedIn != null && !isInvolvedIn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InvolvableElementImpl
