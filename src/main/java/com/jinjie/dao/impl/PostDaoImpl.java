package com.jinjie.dao.impl;

import com.jinjie.bean.Post;
import com.jinjie.dao.PostDao;
import com.jinjie.util.ResultSetHelper;
import com.jinjie.util.ResultSetMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PostDaoImpl extends JdbcDaoSupport implements PostDao {

    @Override
    public List<Post> queryPost() {
        final String QUERY_POST_SQL = "select * from blog_page;";
        List<Post> posts = this.getJdbcTemplate().query(QUERY_POST_SQL, new RowMapper<Post>() {
            @Override
            public Post mapRow(ResultSet resultSet, int i) throws SQLException {
                return (Post) (new PostMapper()).mapResultSet(resultSet, i);
            }
        });
        return posts;
    }

    class PostMapper extends ResultSetHelper implements ResultSetMapper {

        @Override
        public Object mapResultSet(ResultSet resultSet, int i) throws SQLException {
            Post post = new Post();
            post.setId(getInt(resultSet, "ID"));
            post.setContent(getString(resultSet,"CONTENT"));
            post.setCreatedAt(getString(resultSet,"CREATED_AT"));
//            post.setParent(getInt(resultSet,"PARENT"));
//            post.setRight(getInt(resultSet,"RIGHT"));
//            post.setSecret(getInt(resultSet,"SECRET"));
//            post.setState(getInt(resultSet,"STATE"));
//            post.setTitle(getString(resultSet,"TITLE"));
//            post.setUrl(getString(resultSet,"URL"));
            return post;
        }
    }
}
