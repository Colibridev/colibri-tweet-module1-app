package colibri.dev.com.colibritweet.pojo;

public class Tweet {
    private User user;
    private Long id;
    private String creationDate;
    private String text;
    private Long retweetCount;
    private Long favouriteCount;
    private String imageUrl;

    public Tweet(User user, Long id, String creationDate, String text,
                 Long retweetCount, Long favouriteCount, String imageUrl) {
        this.user = user;
        this.id = id;
        this.creationDate = creationDate;
        this.text = text;
        this.retweetCount = retweetCount;
        this.favouriteCount = favouriteCount;
        this.imageUrl = imageUrl;
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getText() {
        return text;
    }

    public Long getRetweetCount() {
        return retweetCount;
    }

    public Long getFavouriteCount() {
        return favouriteCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tweet tweet = (Tweet) o;

        if (!user.equals(tweet.user)) return false;
        if (!id.equals(tweet.id)) return false;
        if (!creationDate.equals(tweet.creationDate)) return false;
        if (!text.equals(tweet.text)) return false;
        if (!retweetCount.equals(tweet.retweetCount)) return false;
        if (!favouriteCount.equals(tweet.favouriteCount)) return false;
        return imageUrl != null ? imageUrl.equals(tweet.imageUrl) : tweet.imageUrl == null;
    }

    @Override
    public int hashCode() {
        int result = user.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + creationDate.hashCode();
        result = 31 * result + text.hashCode();
        result = 31 * result + retweetCount.hashCode();
        result = 31 * result + favouriteCount.hashCode();
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        return result;
    }
}