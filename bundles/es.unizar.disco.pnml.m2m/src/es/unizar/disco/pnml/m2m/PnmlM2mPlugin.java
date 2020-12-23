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
package es.unizar.disco.pnml.m2m;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class PnmlM2mPlugin implements BundleActivator {
	
	public static final String PLUGIN_ID = "es.unizar.disco.pnml.m2m"; //$NON-NLS-1$

	public static final String DPIM_AD2PNML_PERFORMANCE_TRANSFORMATION_URI = "platform:/plugin/" + PLUGIN_ID + "/transformations/dpim-ad2pnml.qvto"; //$NON-NLS-1$ //$NON-NLS-2$
	
	public static final String DPIM_AD2PNML_RELIABILITY_TRANSFORMATION_URI = "platform:/plugin/" + PLUGIN_ID + "/transformations/dpim-ad2pnml-reliability.qvto"; //$NON-NLS-1$ //$NON-NLS-2$

	public static final String DPIM_SD2PNML_TRANSFORMATION_URI = "platform:/plugin/" + PLUGIN_ID + "/transformations/dpim-sd2pnml.qvto"; //$NON-NLS-1$ //$NON-NLS-2$
	
	public static final String DTSM_STORM_AD2PNML_TRANSFORMATION_URI = "platform:/plugin/" + PLUGIN_ID + "/transformations/dtsm-storm-ad2pnml.qvto"; //$NON-NLS-1$ //$NON-NLS-2$
	
	public static final String DTSM_HADOOP_AD2PNML_TRANSFORMATION_URI = "platform:/plugin/" + PLUGIN_ID + "/transformations/dtsm-hadoop-ad2pnml.qvto"; //$NON-NLS-1$ //$NON-NLS-2$
	
	public static final String DTSM_STORM_AD2PNML_RELIABILITY_TRANSFORMATION_URI = "platform:/plugin/" + PLUGIN_ID + "/transformations/dtsm-storm-ad2pnml-reliability.qvto"; //$NON-NLS-1$ //$NON-NLS-2$
	
	public static final String DTSM_HADOOP_AD2PNML_RELIABILITY_TRANSFORMATION_URI= "platform:/plugin/" + PLUGIN_ID + "/transformations/dtsm-hadoop-ad2pnml-reliability.qvto"; //$NON-NLS-1$ //$NON-NLS-2$
	
	public static final String DTSM_SPARK_AD2PNML_RELIABILITY_TRANSFORMATION_URI= "platform:/plugin/" + PLUGIN_ID + "/transformations/dtsm-spark-ad2pnml-reliability.qvto"; //$NON-NLS-1$ //$NON-NLS-2$
		
	public static final String DTSM_SPARK_AD2PNML_TRANSFORMATION_URI = "platform:/plugin/" + PLUGIN_ID + "/transformations/dtsm-spark-ad2pnml.qvto"; //$NON-NLS-1$ //$NON-NLS-2$
		
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		PnmlM2mPlugin.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		PnmlM2mPlugin.context = null;
	}

}
