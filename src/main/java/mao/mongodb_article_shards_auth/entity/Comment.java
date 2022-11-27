package mao.mongodb_article_shards_auth.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Project name(项目名称)：MongoDB_article
 * Package(包名): mao.mongodb_article.entity
 * Class(类名): Comment
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/16
 * Time(创建时间)： 19:35
 * Version(版本): 1.0
 * Description(描述)： 评论表
 */


@Document(collection="comment")//可以省略，如果省略，则默认使用类名小写映射集合
//复合索引
@CompoundIndex( def = "{'userid': 1, 'nickname': -1}")
public class Comment
{

    /**
     * id
     */
    @Id
    private String id;
    /**
     * 内容
     */
    //该属性对应mongodb的字段的名字，如果一致，则无需该注解
    @Field("content")
    private String content;

    /**
     * 发布时间
     */
    private Date publishTime;
    /**
     * 用户标识
     */
    private String userid;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 创建日期时间
     */
    private LocalDateTime createDateTime;
    /**
     * 点赞数
     */
    //单字段的索引
    @Indexed
    private Integer likeNum;
    /**
     * 回复数
     */
    private Integer replyNum;
    /**
     * 状态
     */
    private String state;
    /**
     * 上级ID
     */
    private String parentId;
    /**
     * 文章id
     */
    private String articleId;

    /**
     * Instantiates a new Comment.
     */
    public Comment()
    {

    }

    /**
     * Instantiates a new Comment.
     *
     * @param id             the id
     * @param content        the content
     * @param publishTime    the publish time
     * @param userid         the userid
     * @param nickname       the nickname
     * @param createDateTime the create date time
     * @param likeNum        the like num
     * @param replyNum       the reply num
     * @param state          the state
     * @param parentId       the parent id
     * @param articleId      the article id
     */
    public Comment(String id, String content, Date publishTime, String userid, String nickname,
                   LocalDateTime createDateTime, Integer likeNum, Integer replyNum,
                   String state, String parentId, String articleId)
    {
        this.id = id;
        this.content = content;
        this.publishTime = publishTime;
        this.userid = userid;
        this.nickname = nickname;
        this.createDateTime = createDateTime;
        this.likeNum = likeNum;
        this.replyNum = replyNum;
        this.state = state;
        this.parentId = parentId;
        this.articleId = articleId;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent()
    {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content)
    {
        this.content = content;
    }

    /**
     * Gets publish time.
     *
     * @return the publish time
     */
    public Date getPublishTime()
    {
        return publishTime;
    }

    /**
     * Sets publish time.
     *
     * @param publishTime the publish time
     */
    public void setPublishTime(Date publishTime)
    {
        this.publishTime = publishTime;
    }

    /**
     * Gets userid.
     *
     * @return the userid
     */
    public String getUserid()
    {
        return userid;
    }

    /**
     * Sets userid.
     *
     * @param userid the userid
     */
    public void setUserid(String userid)
    {
        this.userid = userid;
    }

    /**
     * Gets nickname.
     *
     * @return the nickname
     */
    public String getNickname()
    {
        return nickname;
    }

    /**
     * Sets nickname.
     *
     * @param nickname the nickname
     */
    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    /**
     * Gets create date time.
     *
     * @return the create date time
     */
    public LocalDateTime getCreateDateTime()
    {
        return createDateTime;
    }

    /**
     * Sets create date time.
     *
     * @param createDateTime the create date time
     */
    public void setCreateDateTime(LocalDateTime createDateTime)
    {
        this.createDateTime = createDateTime;
    }

    /**
     * Gets like num.
     *
     * @return the like num
     */
    public Integer getLikeNum()
    {
        return likeNum;
    }

    /**
     * Sets like num.
     *
     * @param likeNum the like num
     */
    public void setLikeNum(Integer likeNum)
    {
        this.likeNum = likeNum;
    }

    /**
     * Gets reply num.
     *
     * @return the reply num
     */
    public Integer getReplyNum()
    {
        return replyNum;
    }

    /**
     * Sets reply num.
     *
     * @param replyNum the reply num
     */
    public void setReplyNum(Integer replyNum)
    {
        this.replyNum = replyNum;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState()
    {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state)
    {
        this.state = state;
    }

    /**
     * Gets parent id.
     *
     * @return the parent id
     */
    public String getParentId()
    {
        return parentId;
    }

    /**
     * Sets parent id.
     *
     * @param parentId the parent id
     */
    public void setParentId(String parentId)
    {
        this.parentId = parentId;
    }

    /**
     * Gets article id.
     *
     * @return the article id
     */
    public String getArticleId()
    {
        return articleId;
    }

    /**
     * Sets article id.
     *
     * @param articleId the article id
     */
    public void setArticleId(String articleId)
    {
        this.articleId = articleId;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("content：").append(content).append('\n');
        stringbuilder.append("publishTime：").append(publishTime).append('\n');
        stringbuilder.append("userid：").append(userid).append('\n');
        stringbuilder.append("nickname：").append(nickname).append('\n');
        stringbuilder.append("createDateTime：").append(createDateTime).append('\n');
        stringbuilder.append("likeNum：").append(likeNum).append('\n');
        stringbuilder.append("replyNum：").append(replyNum).append('\n');
        stringbuilder.append("state：").append(state).append('\n');
        stringbuilder.append("parentId：").append(parentId).append('\n');
        stringbuilder.append("articleId：").append(articleId).append('\n');
        return stringbuilder.toString();
    }
}
