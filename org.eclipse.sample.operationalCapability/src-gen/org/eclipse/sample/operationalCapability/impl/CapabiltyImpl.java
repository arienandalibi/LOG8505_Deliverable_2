/**
 */
package org.eclipse.sample.operationalCapability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sample.operationalCapability.Capabilty;
import org.eclipse.sample.operationalCapability.InvolvableElement;
import org.eclipse.sample.operationalCapability.OperationalCapabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capabilty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.operationalCapability.impl.CapabiltyImpl#getInvolves <em>Involves</em>}</li>
 *   <li>{@link org.eclipse.sample.operationalCapability.impl.CapabiltyImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.sample.operationalCapability.impl.CapabiltyImpl#getIsExtendedBy <em>Is Extended By</em>}</li>
 *   <li>{@link org.eclipse.sample.operationalCapability.impl.CapabiltyImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.eclipse.sample.operationalCapability.impl.CapabiltyImpl#getIsIncludedIn <em>Is Included In</em>}</li>
 *   <li>{@link org.eclipse.sample.operationalCapability.impl.CapabiltyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabiltyImpl extends SpecializableElementImpl implements Capabilty {
	/**
	 * The cached value of the '{@link #getInvolves() <em>Involves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolves()
	 * @generated
	 * @ordered
	 */
	protected EList<InvolvableElement> involves;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected Capabilty extends_;

	/**
	 * The cached value of the '{@link #getIsExtendedBy() <em>Is Extended By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExtendedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Capabilty> isExtendedBy;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Capabilty> includes;

	/**
	 * The cached value of the '{@link #getIsIncludedIn() <em>Is Included In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIncludedIn()
	 * @generated
	 * @ordered
	 */
	protected Capabilty isIncludedIn;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabiltyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalCapabilityPackage.Literals.CAPABILTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvolvableElement> getInvolves() {
		if (involves == null) {
			involves = new EObjectWithInverseResolvingEList.ManyInverse<InvolvableElement>(InvolvableElement.class,
					this, OperationalCapabilityPackage.CAPABILTY__INVOLVES,
					OperationalCapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN);
		}
		return involves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilty getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject) extends_;
			extends_ = (Capabilty) eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							OperationalCapabilityPackage.CAPABILTY__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilty basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(Capabilty newExtends, NotificationChain msgs) {
		Capabilty oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OperationalCapabilityPackage.CAPABILTY__EXTENDS, oldExtends, newExtends);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(Capabilty newExtends) {
		if (newExtends != extends_) {
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject) extends_).eInverseRemove(this,
						OperationalCapabilityPackage.CAPABILTY__IS_EXTENDED_BY, Capabilty.class, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject) newExtends).eInverseAdd(this,
						OperationalCapabilityPackage.CAPABILTY__IS_EXTENDED_BY, Capabilty.class, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalCapabilityPackage.CAPABILTY__EXTENDS,
					newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capabilty> getIsExtendedBy() {
		if (isExtendedBy == null) {
			isExtendedBy = new EObjectWithInverseResolvingEList<Capabilty>(Capabilty.class, this,
					OperationalCapabilityPackage.CAPABILTY__IS_EXTENDED_BY,
					OperationalCapabilityPackage.CAPABILTY__EXTENDS);
		}
		return isExtendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capabilty> getIncludes() {
		if (includes == null) {
			includes = new EObjectWithInverseResolvingEList<Capabilty>(Capabilty.class, this,
					OperationalCapabilityPackage.CAPABILTY__INCLUDES,
					OperationalCapabilityPackage.CAPABILTY__IS_INCLUDED_IN);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilty getIsIncludedIn() {
		if (isIncludedIn != null && isIncludedIn.eIsProxy()) {
			InternalEObject oldIsIncludedIn = (InternalEObject) isIncludedIn;
			isIncludedIn = (Capabilty) eResolveProxy(oldIsIncludedIn);
			if (isIncludedIn != oldIsIncludedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							OperationalCapabilityPackage.CAPABILTY__IS_INCLUDED_IN, oldIsIncludedIn, isIncludedIn));
			}
		}
		return isIncludedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilty basicGetIsIncludedIn() {
		return isIncludedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsIncludedIn(Capabilty newIsIncludedIn, NotificationChain msgs) {
		Capabilty oldIsIncludedIn = isIncludedIn;
		isIncludedIn = newIsIncludedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OperationalCapabilityPackage.CAPABILTY__IS_INCLUDED_IN, oldIsIncludedIn, newIsIncludedIn);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIncludedIn(Capabilty newIsIncludedIn) {
		if (newIsIncludedIn != isIncludedIn) {
			NotificationChain msgs = null;
			if (isIncludedIn != null)
				msgs = ((InternalEObject) isIncludedIn).eInverseRemove(this,
						OperationalCapabilityPackage.CAPABILTY__INCLUDES, Capabilty.class, msgs);
			if (newIsIncludedIn != null)
				msgs = ((InternalEObject) newIsIncludedIn).eInverseAdd(this,
						OperationalCapabilityPackage.CAPABILTY__INCLUDES, Capabilty.class, msgs);
			msgs = basicSetIsIncludedIn(newIsIncludedIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					OperationalCapabilityPackage.CAPABILTY__IS_INCLUDED_IN, newIsIncludedIn, newIsIncludedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalCapabilityPackage.CAPABILTY__NAME, oldName,
					name));
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
		case OperationalCapabilityPackage.CAPABILTY__INVOLVES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInvolves()).basicAdd(otherEnd, msgs);
		case OperationalCapabilityPackage.CAPABILTY__EXTENDS:
			if (extends_ != null)
				msgs = ((InternalEObject) extends_).eInverseRemove(this,
						OperationalCapabilityPackage.CAPABILTY__IS_EXTENDED_BY, Capabilty.class, msgs);
			return basicSetExtends((Capabilty) otherEnd, msgs);
		case OperationalCapabilityPackage.CAPABILTY__IS_EXTENDED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsExtendedBy()).basicAdd(otherEnd, msgs);
		case OperationalCapabilityPackage.CAPABILTY__INCLUDES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncludes()).basicAdd(otherEnd, msgs);
		case OperationalCapabilityPackage.CAPABILTY__IS_INCLUDED_IN:
			if (isIncludedIn != null)
				msgs = ((InternalEObject) isIncludedIn).eInverseRemove(this,
						OperationalCapabilityPackage.CAPABILTY__INCLUDES, Capabilty.class, msgs);
			return basicSetIsIncludedIn((Capabilty) otherEnd, msgs);
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
		case OperationalCapabilityPackage.CAPABILTY__INVOLVES:
			return ((InternalEList<?>) getInvolves()).basicRemove(otherEnd, msgs);
		case OperationalCapabilityPackage.CAPABILTY__EXTENDS:
			return basicSetExtends(null, msgs);
		case OperationalCapabilityPackage.CAPABILTY__IS_EXTENDED_BY:
			return ((InternalEList<?>) getIsExtendedBy()).basicRemove(otherEnd, msgs);
		case OperationalCapabilityPackage.CAPABILTY__INCLUDES:
			return ((InternalEList<?>) getIncludes()).basicRemove(otherEnd, msgs);
		case OperationalCapabilityPackage.CAPABILTY__IS_INCLUDED_IN:
			return basicSetIsIncludedIn(null, msgs);
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
		case OperationalCapabilityPackage.CAPABILTY__INVOLVES:
			return getInvolves();
		case OperationalCapabilityPackage.CAPABILTY__EXTENDS:
			if (resolve)
				return getExtends();
			return basicGetExtends();
		case OperationalCapabilityPackage.CAPABILTY__IS_EXTENDED_BY:
			return getIsExtendedBy();
		case OperationalCapabilityPackage.CAPABILTY__INCLUDES:
			return getIncludes();
		case OperationalCapabilityPackage.CAPABILTY__IS_INCLUDED_IN:
			if (resolve)
				return getIsIncludedIn();
			return basicGetIsIncludedIn();
		case OperationalCapabilityPackage.CAPABILTY__NAME:
			return getName();
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
		case OperationalCapabilityPackage.CAPABILTY__INVOLVES:
			getInvolves().clear();
			getInvolves().addAll((Collection<? extends InvolvableElement>) newValue);
			return;
		case OperationalCapabilityPackage.CAPABILTY__EXTENDS:
			setExtends((Capabilty) newValue);
			return;
		case OperationalCapabilityPackage.CAPABILTY__IS_EXTENDED_BY:
			getIsExtendedBy().clear();
			getIsExtendedBy().addAll((Collection<? extends Capabilty>) newValue);
			return;
		case OperationalCapabilityPackage.CAPABILTY__INCLUDES:
			getIncludes().clear();
			getIncludes().addAll((Collection<? extends Capabilty>) newValue);
			return;
		case OperationalCapabilityPackage.CAPABILTY__IS_INCLUDED_IN:
			setIsIncludedIn((Capabilty) newValue);
			return;
		case OperationalCapabilityPackage.CAPABILTY__NAME:
			setName((String) newValue);
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
		case OperationalCapabilityPackage.CAPABILTY__INVOLVES:
			getInvolves().clear();
			return;
		case OperationalCapabilityPackage.CAPABILTY__EXTENDS:
			setExtends((Capabilty) null);
			return;
		case OperationalCapabilityPackage.CAPABILTY__IS_EXTENDED_BY:
			getIsExtendedBy().clear();
			return;
		case OperationalCapabilityPackage.CAPABILTY__INCLUDES:
			getIncludes().clear();
			return;
		case OperationalCapabilityPackage.CAPABILTY__IS_INCLUDED_IN:
			setIsIncludedIn((Capabilty) null);
			return;
		case OperationalCapabilityPackage.CAPABILTY__NAME:
			setName(NAME_EDEFAULT);
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
		case OperationalCapabilityPackage.CAPABILTY__INVOLVES:
			return involves != null && !involves.isEmpty();
		case OperationalCapabilityPackage.CAPABILTY__EXTENDS:
			return extends_ != null;
		case OperationalCapabilityPackage.CAPABILTY__IS_EXTENDED_BY:
			return isExtendedBy != null && !isExtendedBy.isEmpty();
		case OperationalCapabilityPackage.CAPABILTY__INCLUDES:
			return includes != null && !includes.isEmpty();
		case OperationalCapabilityPackage.CAPABILTY__IS_INCLUDED_IN:
			return isIncludedIn != null;
		case OperationalCapabilityPackage.CAPABILTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CapabiltyImpl
