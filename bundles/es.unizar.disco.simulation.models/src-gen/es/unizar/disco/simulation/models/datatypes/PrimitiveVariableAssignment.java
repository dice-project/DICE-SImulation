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
package es.unizar.disco.simulation.models.datatypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.simulation.models.datatypes.PrimitiveVariableAssignment#getVariable <em>Variable</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.datatypes.PrimitiveVariableAssignment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.simulation.models.datatypes.DatatypesPackage#getPrimitiveVariableAssignment()
 * @model
 * @generated
 */
public interface PrimitiveVariableAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see es.unizar.disco.simulation.models.datatypes.DatatypesPackage#getPrimitiveVariableAssignment_Variable()
	 * @model required="true"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link es.unizar.disco.simulation.models.datatypes.PrimitiveVariableAssignment#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Number)
	 * @see es.unizar.disco.simulation.models.datatypes.DatatypesPackage#getPrimitiveVariableAssignment_Value()
	 * @model dataType="es.unizar.disco.simulation.models.datatypes.Number" required="true"
	 * @generated
	 */
	Number getValue();

	/**
	 * Sets the value of the '{@link es.unizar.disco.simulation.models.datatypes.PrimitiveVariableAssignment#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Number value);

} // PrimitiveVariableAssignment
