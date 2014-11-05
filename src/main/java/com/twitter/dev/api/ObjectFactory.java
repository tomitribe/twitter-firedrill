
/*
 * Tomitribe Confidential
 *
 * Copyright Tomitribe Corporation. 2014
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */

package com.twitter.dev.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.twitter.dev.api package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Size_QNAME = new QName("http://dev.twitter.com/api", "size");
    private final static QName _Coordinates_QNAME = new QName("http://dev.twitter.com/api", "coordinates");
    private final static QName _Media_QNAME = new QName("http://dev.twitter.com/api", "media");
    private final static QName _Entities_QNAME = new QName("http://dev.twitter.com/api", "entities");
    private final static QName _Tweets_QNAME = new QName("http://dev.twitter.com/api", "tweets");
    private final static QName _Places_QNAME = new QName("http://dev.twitter.com/api", "places");
    private final static QName _Hashtags_QNAME = new QName("http://dev.twitter.com/api", "hashtags");
    private final static QName _Boundingbox_QNAME = new QName("http://dev.twitter.com/api", "boundingbox");
    private final static QName _Urls_QNAME = new QName("http://dev.twitter.com/api", "urls");
    private final static QName _Usermention_QNAME = new QName("http://dev.twitter.com/api", "usermention");
    private final static QName _Contributors_QNAME = new QName("http://dev.twitter.com/api", "contributors");
    private final static QName _Users_QNAME = new QName("http://dev.twitter.com/api", "users");
    private final static QName _Sizes_QNAME = new QName("http://dev.twitter.com/api", "sizes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.twitter.dev.api
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SizesType }
     */
    public SizesType createSizesType() {
        return new SizesType();
    }

    /**
     * Create an instance of {@link UsersType }
     */
    public UsersType createUsersType() {
        return new UsersType();
    }

    /**
     * Create an instance of {@link ContributorsType }
     */
    public ContributorsType createContributorsType() {
        return new ContributorsType();
    }

    /**
     * Create an instance of {@link UsermentionType }
     */
    public UsermentionType createUsermentionType() {
        return new UsermentionType();
    }

    /**
     * Create an instance of {@link UrlsType }
     */
    public UrlsType createUrlsType() {
        return new UrlsType();
    }

    /**
     * Create an instance of {@link BoundingboxType }
     */
    public BoundingboxType createBoundingboxType() {
        return new BoundingboxType();
    }

    /**
     * Create an instance of {@link PlacesType }
     */
    public PlacesType createPlacesType() {
        return new PlacesType();
    }

    /**
     * Create an instance of {@link EntitiesType }
     */
    public EntitiesType createEntitiesType() {
        return new EntitiesType();
    }

    /**
     * Create an instance of {@link SizeType }
     */
    public SizeType createSizeType() {
        return new SizeType();
    }

    /**
     * Create an instance of {@link HashtagsType }
     */
    public HashtagsType createHashtagsType() {
        return new HashtagsType();
    }

    /**
     * Create an instance of {@link TweetsType }
     */
    public TweetsType createTweetsType() {
        return new TweetsType();
    }

    /**
     * Create an instance of {@link MediaType }
     */
    public MediaType createMediaType() {
        return new MediaType();
    }

    /**
     * Create an instance of {@link CoordinatesType }
     */
    public CoordinatesType createCoordinatesType() {
        return new CoordinatesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "size")
    public JAXBElement<SizeType> createSize(SizeType value) {
        return new JAXBElement<SizeType>(_Size_QNAME, SizeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinatesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "coordinates")
    public JAXBElement<CoordinatesType> createCoordinates(CoordinatesType value) {
        return new JAXBElement<CoordinatesType>(_Coordinates_QNAME, CoordinatesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "media")
    public JAXBElement<MediaType> createMedia(MediaType value) {
        return new JAXBElement<MediaType>(_Media_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntitiesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "entities")
    public JAXBElement<EntitiesType> createEntities(EntitiesType value) {
        return new JAXBElement<EntitiesType>(_Entities_QNAME, EntitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TweetsType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "tweets")
    public JAXBElement<TweetsType> createTweets(TweetsType value) {
        return new JAXBElement<TweetsType>(_Tweets_QNAME, TweetsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "places")
    public JAXBElement<PlacesType> createPlaces(PlacesType value) {
        return new JAXBElement<PlacesType>(_Places_QNAME, PlacesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HashtagsType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "hashtags")
    public JAXBElement<HashtagsType> createHashtags(HashtagsType value) {
        return new JAXBElement<HashtagsType>(_Hashtags_QNAME, HashtagsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoundingboxType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "boundingbox")
    public JAXBElement<BoundingboxType> createBoundingbox(BoundingboxType value) {
        return new JAXBElement<BoundingboxType>(_Boundingbox_QNAME, BoundingboxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrlsType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "urls")
    public JAXBElement<UrlsType> createUrls(UrlsType value) {
        return new JAXBElement<UrlsType>(_Urls_QNAME, UrlsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsermentionType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "usermention")
    public JAXBElement<UsermentionType> createUsermention(UsermentionType value) {
        return new JAXBElement<UsermentionType>(_Usermention_QNAME, UsermentionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContributorsType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "contributors")
    public JAXBElement<ContributorsType> createContributors(ContributorsType value) {
        return new JAXBElement<ContributorsType>(_Contributors_QNAME, ContributorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsersType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "users")
    public JAXBElement<UsersType> createUsers(UsersType value) {
        return new JAXBElement<UsersType>(_Users_QNAME, UsersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://dev.twitter.com/api", name = "sizes")
    public JAXBElement<SizesType> createSizes(SizesType value) {
        return new JAXBElement<SizesType>(_Sizes_QNAME, SizesType.class, null, value);
    }

}
