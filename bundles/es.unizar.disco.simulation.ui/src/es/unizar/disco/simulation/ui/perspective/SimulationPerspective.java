/*******************************************************************************
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
 *******************************************************************************/
package es.unizar.disco.simulation.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

import es.unizar.disco.simulation.ui.views.InvocationsView;

public class SimulationPerspective implements IPerspectiveFactory {

	private static final String TOP_FOLDER = "TOP_FOLDER";
	private static final String TOP_LEFT_FOLDER = "TOP_LEFT_FOLDER";
	private static final String TOP_RIGHT_FOLDER = "TOP_RIGHT_FOLDER";

	private static final String BOTTOM_FOLDER = "BOTTOM_FOLDER";
	private static final String BOTTOM_LEFT_FOLDER = "BOTTOM_LEFT_FOLDER";
	private static final String BOTTOM_RIGHT_FOLDER = "BOTTOM_RIGHT_FOLDER";

	private IPageLayout factory;

	public void createInitialLayout(IPageLayout factory) {
		this.factory = factory;
		addViews();
		addActionSets();
		addPerspectiveShortcuts();
		addViewShortcuts();
	}

	@SuppressWarnings("unused")
	private void addViews() {
		IFolderLayout top = factory.createFolder(TOP_FOLDER, IPageLayout.TOP, 0.33f, factory.getEditorArea());
		IFolderLayout topLeft = factory.createFolder(TOP_LEFT_FOLDER, IPageLayout.LEFT, 0.5f, TOP_FOLDER);
		IFolderLayout topRight = factory.createFolder(TOP_RIGHT_FOLDER, IPageLayout.RIGHT, 0.5f, TOP_FOLDER);

		IFolderLayout bottom = factory.createFolder(BOTTOM_FOLDER, IPageLayout.BOTTOM, 0.5f, factory.getEditorArea());
		IFolderLayout bottomLeft = factory.createFolder(BOTTOM_LEFT_FOLDER, IPageLayout.LEFT, 0.5f, BOTTOM_FOLDER);
		IFolderLayout bottomRight = factory.createFolder(BOTTOM_RIGHT_FOLDER, IPageLayout.RIGHT, 0.5f, BOTTOM_FOLDER);

		topLeft.addView("org.eclipse.debug.ui.DebugView");
		topRight.addView(IConsoleConstants.ID_CONSOLE_VIEW);
		topRight.addView("org.eclipse.pde.runtime.LogView");
		bottom.addView(InvocationsView.ID);

	}

	private void addActionSets() {
		factory.addActionSet("org.eclipse.debug.ui.launchActionSet");
		factory.addActionSet("org.eclipse.debug.ui.debugActionSet");
	}

	private void addPerspectiveShortcuts() {
		factory.addPerspectiveShortcut("org.eclipse.papyrus.infra.core.perspective");
		factory.addPerspectiveShortcut("org.eclipse.jdt.ui.JavaPerspective");
	}

	private void addViewShortcuts() {
		factory.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
		factory.addShowViewShortcut("org.eclipse.jdt.ui.PackageExplorer");
		factory.addShowViewShortcut("org.eclipse.pde.runtime.LogView");
	}

}
