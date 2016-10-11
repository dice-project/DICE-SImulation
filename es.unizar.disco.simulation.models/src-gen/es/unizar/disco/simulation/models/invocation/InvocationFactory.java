/**
 */
package es.unizar.disco.simulation.models.invocation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.simulation.models.invocation.InvocationPackage
 * @generated
 */
public interface InvocationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InvocationFactory eINSTANCE = es.unizar.disco.simulation.models.invocation.impl.InvocationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simulation Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation Invocation</em>'.
	 * @generated
	 */
	SimulationInvocation createSimulationInvocation();

	/**
	 * Returns a new object of class '<em>Invocations Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invocations Registry</em>'.
	 * @generated
	 */
	InvocationsRegistry createInvocationsRegistry();

	/**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	InvocationSet createInvocationSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InvocationPackage getInvocationPackage();

} //InvocationFactory
