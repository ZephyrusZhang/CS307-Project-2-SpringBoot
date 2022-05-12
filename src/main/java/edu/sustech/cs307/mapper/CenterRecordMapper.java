package edu.sustech.cs307.mapper;

import edu.sustech.cs307.entity.CenterRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Zephyrus
 * @since 2022-05-08
 */
@Mapper
public interface CenterRecordMapper extends BaseMapper<CenterRecord> {

    void addCenterRecord(CenterRecord centerRecord);

}
