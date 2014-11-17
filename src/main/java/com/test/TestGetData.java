package com.test;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import yangzhili.TrainDetailInfo;

public class TestGetData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TrainServiceStub stub = new TrainServiceStub();
			yangzhili.GetTrainDetailInfoByTrainNumber number = new yangzhili.GetTrainDetailInfoByTrainNumber();
			number.setTrainNumber("001");
			number.setUserId("001");
			yangzhili.GetTrainDetailInfoByTrainNumberResponse response = stub.getTrainDetailInfoByTrainNumber(number);
			
			TrainDetailInfo trainDetailInfo = new TrainDetailInfo();
			for(int i=0;i<response.getGetTrainDetailInfoByTrainNumberResult().getTrainDetailInfo().length;i++){
				trainDetailInfo = response.getGetTrainDetailInfoByTrainNumberResult().getTrainDetailInfo()[i];
//				System.out.println(new String(new String(("getStation:"+trainDetailInfo.getStation()+"-getTraintype:"+trainDetailInfo.getTraintype()).getBytes("UTF-8")).getBytes("BIG5")));
				System.out.println(new String(("getTrainNumber:"+trainDetailInfo.getTrainNumber()+"-getArriveTime:"+trainDetailInfo.getArriveTime()).getBytes("UTF-8"),"BIG5"));
//				System.setOut(new PrintStream(System.out, true, "UTF-8"));
				System.out.println(TT.utf8ToBig5(trainDetailInfo.getArriveTime()));
				System.out.println(trainDetailInfo.getArriveTime());
			}
			
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
