package mao.mongodb_article_shards_auth.controller;

import mao.mongodb_article_shards_auth.entity.Comment;
import mao.mongodb_article_shards_auth.service.CommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Project name(项目名称)：MongoDB_article
 * Package(包名): mao.mongodb_article.controller
 * Class(类名): CommentController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/16
 * Time(创建时间)： 19:58
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@RestController
@RequestMapping("/comment")
public class CommentController
{

    @Resource
    private CommentService commentService;

    /**
     * 查询所有
     *
     * @return {@link List}<{@link Comment}>
     */
    @GetMapping
    public List<Comment> findAll()
    {
        return commentService.findCommentList();
    }

    /**
     * 通过id查询
     *
     * @param id id
     * @return {@link Comment}
     */
    @GetMapping("/{id}")
    public Comment findById(@PathVariable String id)
    {
        return commentService.findCommentById(id);
    }

    /**
     * 保存
     *
     * @param comment 评论
     */
    @PostMapping
    public void save(@RequestBody Comment comment)
    {
        commentService.saveComment(comment);
    }

    /**
     * 更新
     *
     * @param comment 评论
     */
    @PutMapping
    public void update(@RequestBody Comment comment)
    {
        commentService.updateComment(comment);
    }

    /**
     * 通过id删除
     *
     * @param id id
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id)
    {
        commentService.deleteCommentById(id);
    }

    /**
     * 点赞数+1
     *
     * @param id id
     */
    @PutMapping("/likeNum/{id}")
    public void updateCommentLikeNum(@PathVariable String id)
    {
        commentService.updateCommentLikeNum(id);
    }
}
