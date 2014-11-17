
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package yangzhili;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "Yangzhili".equals(namespaceURI) &&
                  "TrainDetailInfo".equals(typeName)){
                   
                            return  yangzhili.TrainDetailInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "Yangzhili".equals(namespaceURI) &&
                  "ArrayOfTrainDetailInfo".equals(typeName)){
                   
                            return  yangzhili.ArrayOfTrainDetailInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "Yangzhili".equals(namespaceURI) &&
                  "ArrayOfTrainInfo".equals(typeName)){
                   
                            return  yangzhili.ArrayOfTrainInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "Yangzhili".equals(namespaceURI) &&
                  "TrainInfo".equals(typeName)){
                   
                            return  yangzhili.TrainInfo.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    