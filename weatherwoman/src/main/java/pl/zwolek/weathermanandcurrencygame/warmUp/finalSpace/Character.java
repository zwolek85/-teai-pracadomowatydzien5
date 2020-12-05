
package pl.zwolek.weathermanandcurrencygame.warmUp.finalSpace;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "status",
    "species",
    "gender",
    "hair",
    "alias",
    "origin",
    "abilities",
    "img_url"
})
public class Character {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("status")
    private String status;
    @JsonProperty("species")
    private String species;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("hair")
    private String hair;
    @JsonProperty("alias")
    private List<String> alias = null;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("abilities")
    private List<String> abilities = null;
    @JsonProperty("img_url")
    private String imgUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("species")
    public String getSpecies() {
        return species;
    }

    @JsonProperty("species")
    public void setSpecies(String species) {
        this.species = species;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("hair")
    public String getHair() {
        return hair;
    }

    @JsonProperty("hair")
    public void setHair(String hair) {
        this.hair = hair;
    }

    @JsonProperty("alias")
    public List<String> getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("abilities")
    public List<String> getAbilities() {
        return abilities;
    }

    @JsonProperty("abilities")
    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    @JsonProperty("img_url")
    public String getImgUrl() {
        return imgUrl;
    }

    @JsonProperty("img_url")
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
