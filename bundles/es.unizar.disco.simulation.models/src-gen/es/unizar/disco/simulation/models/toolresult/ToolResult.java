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
package es.unizar.disco.simulation.models.toolresult;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.simulation.models.toolresult.ToolResult#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.toolresult.ToolResult#getInfos <em>Infos</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.simulation.models.toolresult.ToolresultPackage#getToolResult()
 * @model abstract="true"
 * @generated
 */
public interface ToolResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see es.unizar.disco.simulation.models.toolresult.ToolresultPackage#getToolResult_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link es.unizar.disco.simulation.models.toolresult.ToolResult#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Infos</b></em>' containment reference list.
	 * The list contents are of type {@link es.unizar.disco.simulation.models.toolresult.AnalyzableElementInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infos</em>' containment reference list.
	 * @see es.unizar.disco.simulation.models.toolresult.ToolresultPackage#getToolResult_Infos()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnalyzableElementInfo> getInfos();

} // ToolResult
