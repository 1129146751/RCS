package com.songtech.model.roomBranch1;

import com.songtech.model.roomBranch1.User;
import com.songtech.model.roomBranch1.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long uId);

    int insert(User record);

    int insertSelective(User record);

    /**
     *
     * @param example
     * @return
     */
    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long uId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 更新
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 通过一个对象更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}