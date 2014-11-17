/**
 * TrainServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.test;

/**
 * TrainServiceCallbackHandler Callback class, Users can extend this class and
 * implement their own receiveResult and receiveError methods.
 */
public abstract class TrainServiceCallbackHandler {

	protected Object clientData;

	/**
	 * User can pass in any object that needs to be accessed once the
	 * NonBlocking Web service call is finished and appropriate method of this
	 * CallBack is called.
	 * 
	 * @param clientData
	 *            Object mechanism by which the user can pass in user data that
	 *            will be avilable at the time this callback is called.
	 */
	public TrainServiceCallbackHandler(Object clientData) {
		this.clientData = clientData;
	}

	/**
	 * Please use this constructor if you don't want to set any clientData
	 */
	public TrainServiceCallbackHandler() {
		this.clientData = null;
	}

	/**
	 * Get the client data
	 */

	public Object getClientData() {
		return clientData;
	}

	/**
	 * auto generated Axis2 call back method for getJsonDetailInfoByTrainNumber
	 * method override this method for handling normal response from
	 * getJsonDetailInfoByTrainNumber operation
	 */
	public void receiveResultgetJsonDetailInfoByTrainNumber(yangzhili.GetJsonDetailInfoByTrainNumberResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from getJsonDetailInfoByTrainNumber operation
	 */
	public void receiveErrorgetJsonDetailInfoByTrainNumber(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getJsonTrainStationToStation
	 * method override this method for handling normal response from
	 * getJsonTrainStationToStation operation
	 */
	public void receiveResultgetJsonTrainStationToStation(yangzhili.GetJsonTrainStationToStationResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from getJsonTrainStationToStation operation
	 */
	public void receiveErrorgetJsonTrainStationToStation(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getTrainStationToStation method
	 * override this method for handling normal response from
	 * getTrainStationToStation operation
	 */
	public void receiveResultgetTrainStationToStation(yangzhili.GetTrainStationToStationResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from getTrainStationToStation operation
	 */
	public void receiveErrorgetTrainStationToStation(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getTrainDetailInfoByTrainNumber
	 * method override this method for handling normal response from
	 * getTrainDetailInfoByTrainNumber operation
	 */
	public void receiveResultgetTrainDetailInfoByTrainNumber(yangzhili.GetTrainDetailInfoByTrainNumberResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from getTrainDetailInfoByTrainNumber operation
	 */
	public void receiveErrorgetTrainDetailInfoByTrainNumber(java.lang.Exception e) {
	}

}
