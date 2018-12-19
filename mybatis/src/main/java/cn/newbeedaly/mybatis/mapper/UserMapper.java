package cn.newbeedaly.mybatis.mapper;

import cn.newbeedaly.mybatis.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

  /* #{} 占位符，${} 非占位，有sql注入风险 */
  @Select("SELECT id id,username name,age age FROM users WHERE id = #{id}")
  User selectUser(int id);

  @Insert("insert into users(id,username,age) values(#{id},#{name},#{age})")
  int insertUser(User user);

}
