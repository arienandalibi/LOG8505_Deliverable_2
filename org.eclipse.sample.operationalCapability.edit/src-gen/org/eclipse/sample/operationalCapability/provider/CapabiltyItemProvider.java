/**
 */
package org.eclipse.sample.operationalCapability.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.sample.operationalCapability.OperationalCapabilityPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sample.operationalCapability.Capabilty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabiltyItemProvider extends SpecializableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabiltyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInvolvesPropertyDescriptor(object);
			addExtendsPropertyDescriptor(object);
			addIsExtendedByPropertyDescriptor(object);
			addIncludesPropertyDescriptor(object);
			addIsIncludedInPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Involves feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvolvesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Capabilty_involves_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Capabilty_involves_feature",
								"_UI_Capabilty_type"),
						OperationalCapabilityPackage.Literals.CAPABILTY__INVOLVES, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Extends feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Capabilty_extends_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Capabilty_extends_feature",
								"_UI_Capabilty_type"),
						OperationalCapabilityPackage.Literals.CAPABILTY__EXTENDS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Extended By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExtendedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Capabilty_isExtendedBy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Capabilty_isExtendedBy_feature",
								"_UI_Capabilty_type"),
						OperationalCapabilityPackage.Literals.CAPABILTY__IS_EXTENDED_BY, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Includes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Capabilty_includes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Capabilty_includes_feature",
								"_UI_Capabilty_type"),
						OperationalCapabilityPackage.Literals.CAPABILTY__INCLUDES, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Is Included In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsIncludedInPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Capabilty_isIncludedIn_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Capabilty_isIncludedIn_feature",
								"_UI_Capabilty_type"),
						OperationalCapabilityPackage.Literals.CAPABILTY__IS_INCLUDED_IN, true, false, true, null, null,
						null));
	}

	/**
	 * This returns Capabilty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Capabilty"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Capabilty_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
