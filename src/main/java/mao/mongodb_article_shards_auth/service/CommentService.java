package mao.mongodb_article_shards_auth.service;

import mao.mongodb_article_shards_auth.entity.Comment;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Project name(项目名称)：MongoDB_article
 * Package(包名): mao.mongodb_article.service
 * Interface(接口名): CommentService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/16
 * Time(创建时间)： 19:50
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface CommentService
{
    /**
     * 保存评论
     *
     * @param comment 评论
     */
    void saveComment(Comment comment);

    /**
     * 更新评论
     *
     * @param comment 评论
     */
    void updateComment(Comment comment);

    /**
     * 通过id删除评论
     *
     * @param id id
     */
    void deleteCommentById(String id);

    /**
     * 查询所有评论
     *
     * @return {@link List}<{@link Comment}>
     */
    List<Comment> findCommentList();

    /**
     * 根据id查询评论
     *
     * @param id id
     * @return {@link Comment}
     */
    Comment findCommentById(String id);


    /**
     * 通过父id找到评论，分页
     *
     * @param parentId 父id
     * @param page     页面号码
     * @param size     页大小
     * @return {@link Page}<{@link Comment}>
     */
    Page<Comment> findCommentPageByParentId(String parentId, int page, int size);

    /**
     * 点赞数量+1
     *
     * @param id id
     */
    void updateCommentLikeNum(String id);

}
