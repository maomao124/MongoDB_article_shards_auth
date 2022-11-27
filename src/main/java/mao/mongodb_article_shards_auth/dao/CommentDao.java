package mao.mongodb_article_shards_auth.dao;

import mao.mongodb_article_shards_auth.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Project name(项目名称)：MongoDB_article
 * Package(包名): mao.mongodb_article.dao
 * Interface(接口名): CommentDao
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/16
 * Time(创建时间)： 19:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface CommentDao extends MongoRepository<Comment, String>
{
    /**
     * 根据上级ID查询文章评论的分页列表
     *
     * @param parentId 父id
     * @param pageable Pageable
     * @return {@link Page}<{@link Comment}>
     */
    Page<Comment> findByParentId(String parentId, Pageable pageable);
}
