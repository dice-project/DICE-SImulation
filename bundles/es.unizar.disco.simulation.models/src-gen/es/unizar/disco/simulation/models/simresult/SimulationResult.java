/**
 * Copyright (c) 2020 DisCo Group - Universidad de Zaragoza.
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-1.0/
 * 
 * SPDX-License-Identifier: EPL-1.0
 * 
 * Contributors:
 *     Abel Gómez
 *     Ignacio Requeno
 *     Diego Pérez
 */
package es.unizar.disco.simulation.models.simresult;

import es.unizar.disco.simulation.models.invocation.SimulationInvocation;

import es.unizar.disco.simulation.models.measures.DomainMeasure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.simulation.models.simresult.SimulationResult#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.simresult.SimulationResult#getMeasures <em>Measures</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.simulation.models.simresult.SimresultPackage#getSimulationResult()
 * @model
 * @generated
 */
public interface SimulationResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Invocation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.unizar.disco.simulation.models.invocation.SimulationInvocation#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation</em>' reference.
	 * @see #setInvocation(SimulationInvocation)
	 * @see es.unizar.disco.simulation.models.simresult.SimresultPackage#getSimulationResult_Invocation()
	 * @see es.unizar.disco.simulation.models.invocation.SimulationInvocation#getResult
	 * @model opposite="result" required="true"
	 * @generated
	 */
	SimulationInvocation getInvocation();

	/**
	 * Sets the value of the '{@link es.unizar.disco.simulation.models.simresult.SimulationResult#getInvocation <em>Invocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocation</em>' reference.
	 * @see #getInvocation()
	 * @generated
	 */
	void setInvocation(SimulationInvocation value);

	/**
	 * Returns the value of the '<em><b>Measures</b></em>' containment reference list.
	 * The list contents are of type {@link es.unizar.disco.simulation.models.measures.DomainMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' containment reference list.
	 * @see es.unizar.disco.simulation.models.simresult.SimresultPackage#getSimulationResult_Measures()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainMeasure> getMeasures();

} // SimulationResult
