package models.apis.custom;

import models.apis.swagger.Swagger;
import org.jongo.marshall.jackson.oid.MongoId;
import org.jongo.marshall.jackson.oid.MongoObjectId;

import java.util.Map;

/**
 * Created by apple on 16/5/22.
 */
public class ScenarioDoc {
    @MongoId
    @MongoObjectId
    private String _id;
    protected String tagName;
    protected String scenarioName;
    protected Swagger swagger;
    protected Map<String,ScenarioApiInfo> dependsOn;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Swagger getSwagger() {
        return swagger;
    }

    public void setSwagger(Swagger swagger) {
        this.swagger = swagger;
    }

    public Map<String, ScenarioApiInfo> getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn(Map<String, ScenarioApiInfo> dependsOn) {
        this.dependsOn = dependsOn;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    @Override
    public boolean equals(Object obj) { if (this == obj) {
        return true;
    }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ScenarioDoc other = (ScenarioDoc) obj;
        if (tagName == null) {
            if (other.tagName != null) {
                return false;
            }
        } else if (!tagName.equals(other.tagName)) {
            return false;
        }

        if (swagger == null) {
            if (other.swagger != null) {
                return false;
            }
        } else if (!swagger.equals(other.swagger)) {
            return false;
        }

        if (dependsOn == null) {
            if (other.dependsOn != null) {
                return false;
            }
        } else if (!dependsOn.equals(other.dependsOn)) {
            return false;
        }

        if (scenarioName == null) {
            if (other.scenarioName != null) {
                return false;
            }
        } else if (!scenarioName.equals(other.scenarioName)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tagName == null) ? 0 : tagName.hashCode());
        result = prime * result + ((swagger == null) ? 0 : swagger.hashCode());
        result = prime * result + ((dependsOn == null) ? 0 : dependsOn.hashCode());
        result = prime * result + ((scenarioName == null) ? 0 : scenarioName.hashCode());
        return result;
    }
}
