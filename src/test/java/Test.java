import com.william.entity.User;
import com.william.mapper.UserMapper;
import com.william.utils.GetSqlSession;
import org.apache.ibatis.session.SqlSession;

/**
 * @Author: Xinyu Wei
 * @Description:
 * @Date: Created on 2023/3/3
 * @Modified By:
 */
public class Test {
    public static void main(String[] args) {
        SqlSession session = GetSqlSession.createSqlSession();
        assert session != null;
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.queryUserByName("admin");
        System.out.println(user);
    }
}
