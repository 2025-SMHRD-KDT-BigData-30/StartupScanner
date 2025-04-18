package com.smhrd.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.model.CommercialSalesDTO;
import com.smhrd.model.DeliverySalesDTO;
import com.smhrd.model.DongStopDTO;

@Mapper
public interface DataMapper {
    public CommercialSalesDTO load상가Data(String param1, String param2);
    public DeliverySalesDTO load배달DataM(String param1, String param2);
    public DeliverySalesDTO load배달DataF(String param1, String param2);
    
    
    public List<DongStopDTO> load인구1Data(String param1);
    public List<List<String>> load인구2Data(String param1, String param2);

}
