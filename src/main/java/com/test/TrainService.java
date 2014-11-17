/**
 * TrainService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.test;

/*
 *  TrainService java interface
 */

public interface TrainService {

	/**
	 * Auto generated method signature
	 * &lt;h3&gt;车次详情查询（JSON）&lt;/h3&gt;输入参数:车次，依据该车次代码返回JSON数据
	 * 。trainNumber：车次，Traintype
	 * ：类型，StationNo：站次，Station：站名，Day：日期，ArriveTime：到达时间
	 * ，DepartureTime：开车时间，Mileage：里程，查询过程失败或异常TrainNumber为False。
	 * 
	 * @param getJsonDetailInfoByTrainNumber0
	 */

	public yangzhili.GetJsonDetailInfoByTrainNumberResponse getJsonDetailInfoByTrainNumber(

	yangzhili.GetJsonDetailInfoByTrainNumber getJsonDetailInfoByTrainNumber0) throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * &lt;h3&gt;车次详情查询
	 * （JSON）&lt;/h3&gt;输入参数:车次，依据该车次代码返回JSON数据。trainNumber：车次，Traintype
	 * ：类型，StationNo
	 * ：站次，Station：站名，Day：日期，ArriveTime：到达时间，DepartureTime：开车时间，Mileage
	 * ：里程，查询过程失败或异常TrainNumber为False。
	 * 
	 * @param getJsonDetailInfoByTrainNumber0
	 */
	public void startgetJsonDetailInfoByTrainNumber(

	yangzhili.GetJsonDetailInfoByTrainNumber getJsonDetailInfoByTrainNumber0,

	final com.test.TrainServiceCallbackHandler callback)

	throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * &lt;h3&gt;站到站查询（JSON）&lt;/h3&gt;输入参数:发车站和目的站
	 * ，依据输入的站名返回JSON数据。TrainNumber：车次
	 * ，Traintype：类型，FirstStation：始发站，TerminalStation
	 * ：终点站，StartStation：出发站，StartTime
	 * ：发车时间，ArriveStation：目的站，ArriveTime：到达目的站的时间
	 * ，UseTime：用时，Mileage：出发站到达目的站的里程，查询过程失败或异常TrainNumber为False。
	 * 
	 * @param getJsonTrainStationToStation2
	 */

	public yangzhili.GetJsonTrainStationToStationResponse getJsonTrainStationToStation(

	yangzhili.GetJsonTrainStationToStation getJsonTrainStationToStation2) throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * &lt;h3&gt;站到站查询
	 * （JSON）&lt;/h3&gt;输入参数:发车站和目的站，依据输入的站名返回JSON数据。TrainNumber：车次
	 * ，Traintype：类型，
	 * FirstStation：始发站，TerminalStation：终点站，StartStation：出发站，StartTime
	 * ：发车时间，ArriveStation
	 * ：目的站，ArriveTime：到达目的站的时间，UseTime：用时，Mileage：出发站到达目的站的里程
	 * ，查询过程失败或异常TrainNumber为False。
	 * 
	 * @param getJsonTrainStationToStation2
	 */
	public void startgetJsonTrainStationToStation(

	yangzhili.GetJsonTrainStationToStation getJsonTrainStationToStation2,

	final com.test.TrainServiceCallbackHandler callback)

	throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * &lt;h3&gt;站到站查询&lt;/h3&gt;输入参数:发车站和目的站，依据输入的站名返回实体集
	 * 。TrainNumber：车次，Traintype
	 * ：类型，FirstStation：始发站，TerminalStation：终点站，StartStation
	 * ：出发站，StartTime：发车时间，ArriveStation
	 * ：目的站，ArriveTime：到达目的站的时间，UseTime：用时，Mileage
	 * ：出发站到达目的站的里程，查询过程失败或异常TrainNumber为False。
	 * 
	 * @param getTrainStationToStation4
	 */

	public yangzhili.GetTrainStationToStationResponse getTrainStationToStation(

	yangzhili.GetTrainStationToStation getTrainStationToStation4) throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * &lt;h3&gt;站到站查询
	 * &lt;/h3&gt;输入参数:发车站和目的站，依据输入的站名返回实体集。TrainNumber：车次，Traintype
	 * ：类型，FirstStation
	 * ：始发站，TerminalStation：终点站，StartStation：出发站，StartTime：发车时间，ArriveStation
	 * ：目的站，ArriveTime：到达目的站的时间，UseTime：用时，Mileage：出发站到达目的站的里程，
	 * 查询过程失败或异常TrainNumber为False。
	 * 
	 * @param getTrainStationToStation4
	 */
	public void startgetTrainStationToStation(

	yangzhili.GetTrainStationToStation getTrainStationToStation4,

	final com.test.TrainServiceCallbackHandler callback)

	throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * &lt;h3&gt;车次详情查询&lt;/h3&gt;输入参数:车次，依据该车次代码返回实体集
	 * 。trainNumber：车次，Traintype：类型
	 * ，StationNo：站次，Station：站名，Day：日期，ArriveTime：到达时间
	 * ，DepartureTime：开车时间，Mileage：里程，查询过程失败或异常TrainNumber为False。
	 * 
	 * @param getTrainDetailInfoByTrainNumber6
	 */

	public yangzhili.GetTrainDetailInfoByTrainNumberResponse getTrainDetailInfoByTrainNumber(

	yangzhili.GetTrainDetailInfoByTrainNumber getTrainDetailInfoByTrainNumber6) throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * &lt;h3&gt;车次详情查询
	 * &lt;/h3&gt;输入参数:车次，依据该车次代码返回实体集。trainNumber：车次，Traintype：类型
	 * ，StationNo：站次，Station
	 * ：站名，Day：日期，ArriveTime：到达时间，DepartureTime：开车时间，Mileage
	 * ：里程，查询过程失败或异常TrainNumber为False。
	 * 
	 * @param getTrainDetailInfoByTrainNumber6
	 */
	public void startgetTrainDetailInfoByTrainNumber(

	yangzhili.GetTrainDetailInfoByTrainNumber getTrainDetailInfoByTrainNumber6,

	final com.test.TrainServiceCallbackHandler callback)

	throws java.rmi.RemoteException;

	//
}
