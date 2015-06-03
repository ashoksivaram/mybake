package com.mybake.ppc.model.common;

public abstract class ModelBase {
	private String guid;
	private String version;

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
