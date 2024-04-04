package com.sathya.app;

public class Model {
private int modelId;
private String modelCode;
private double modelCost;
private Margin mgobj;
public Model() {
	super();
}
public int getModelId() {
	return modelId;
}
public void setModelId(int modelId) {
	this.modelId = modelId;
}
public String getModelCode() {
	return modelCode;
}
public void setModelCode(String modelCode) {
	this.modelCode = modelCode;
}
public double getModelCost() {
	return modelCost;
}
public void setModelCost(double modelCost) {
	this.modelCost = modelCost;
}
public Margin getMgobj() {
	return mgobj;
}
public void setMgobj(Margin mgobj) {
	this.mgobj = mgobj;
	}
@Override
public String toString() {
	return "Model [modelId=" + modelId + ", modelCode=" + modelCode + ", modelCost=" + modelCost + ", mgobj=" + mgobj
			+ "]";
}
}
