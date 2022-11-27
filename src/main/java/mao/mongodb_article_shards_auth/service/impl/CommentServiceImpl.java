package mao.mongodb_article_shards_auth.service.impl;

import mao.mongodb_article_shards_auth.dao.CommentDao;
import mao.mongodb_article_shards_auth.entity.Comment;
import mao.mongodb_article_shards_auth.service.CommentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * Project name(项目名称)：MongoDB_article
 * Package(包名): mao.mongodb_article.service.impl
 * Class(类名): CommentServiceImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/16
 * Time(创建时间)： 19:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Service
public class CommentServiceImpl implements CommentService
{

    @Resource
    private MongoTemplate mongoTemplate;

    @Resource
    private CommentDao commentDao;

    @Override
    public void saveComment(Comment comment)
    {
        commentDao.save(comment);
    }

    @Override
    public void updateComment(Comment comment)
    {
        commentDao.save(comment);
    }

    @Override
    public void deleteCommentById(String id)
    {
        commentDao.deleteById(id);
    }

    @Override
    public List<Comment> findCommentList()
    {
        return commentDao.findAll();
    }

    @Override
    public Comment findCommentById(String id)
    {
        Optional<Comment> commentOptional = commentDao.findById(id);
        return commentOptional.orElse(null);
    }

    @Override
    public Page<Comment> findCommentPageByParentId(String parentId, int page, int size)
    {
        return commentDao.findByParentId(parentId, PageRequest.of(page, size));
    }

    @Override
    public void updateCommentLikeNum(String id)
    {
        //此方法不能先查询再更新，这样做就对MongoDB服务发起了两次请求，正常的一次网络io的时间大概在1-5毫秒左右，
        //MongoDB服务对请求的处理时间可能远远小于此值
        Update update = new Update();
        update.inc("likeNum", 1);
        mongoTemplate.updateFirst(Query.query(Criteria.where("_id").is(id)), update, Comment.class);
    }
}
