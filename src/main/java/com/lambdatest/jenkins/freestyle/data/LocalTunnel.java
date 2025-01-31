package com.lambdatest.jenkins.freestyle.data;

import java.io.Serializable;

import org.kohsuke.stapler.DataBoundConstructor;

public class LocalTunnel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tunnelName;
	private boolean sharedTunnel;
	private String tunnelExtCommand;

	@DataBoundConstructor
	public LocalTunnel(boolean useLocalTunnel,String tunnelName, boolean sharedTunnel, String tunnelExtCommand) {
		super();
		this.tunnelName = tunnelName;
		this.sharedTunnel = sharedTunnel;
		this.tunnelExtCommand = tunnelExtCommand;
	}

	public String getTunnelName() {
		return tunnelName;
	}

	public void setTunnelName(String tunnelName) {
		this.tunnelName = tunnelName;
	}

	public boolean isSharedTunnel() {
		return sharedTunnel;
	}

	public void setSharedTunnel(boolean sharedTunnel) {
		this.sharedTunnel = sharedTunnel;
	}

	public String getTunnelExtCommand() {
		return tunnelExtCommand;
	}

	public void setTunnelExtCommand(String tunnelExtCommand) {
		this.tunnelExtCommand = tunnelExtCommand;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\ntunnelName=");
		builder.append(tunnelName);
		builder.append(", \nsharedTunnel=");
		builder.append(sharedTunnel);
		builder.append(", \ntunnelExtCommand=");
		builder.append(tunnelExtCommand);
		builder.append("\n}");
		return builder.toString();
	}

	

}
