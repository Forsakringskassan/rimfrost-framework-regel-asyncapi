package se.fk.rimfrost.framework.regel;

import java.io.Serializable;
import java.util.HashMap;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;

@SuppressFBWarnings("EI_EXPOSE_REP")
public class RegelRequestMessagePayload implements Serializable
{
   private static final long serialVersionUID = 1L;

   @JsonProperty("specversion")
   @JsonInclude(Include.NON_NULL)
   private SpecVersion specversion;
   @JsonProperty("id")
   @JsonInclude(Include.NON_NULL)
   private String id;
   @JsonProperty("source")
   @JsonInclude(Include.NON_NULL)
   private String source;
   @JsonProperty("type")
   @JsonInclude(Include.NON_NULL)
   private String type;
   @JsonProperty("time")
   @JsonInclude(Include.NON_NULL)
   private OffsetDateTime time;
   @JsonProperty("kogitoparentprociid")
   @JsonInclude(Include.NON_NULL)
   private String kogitoparentprociid;
   @JsonProperty("kogitorootprocid")
   @JsonInclude(Include.NON_NULL)
   private String kogitorootprocid;
   @JsonProperty("kogitoproctype")
   @JsonInclude(Include.NON_NULL)
   private Kogitoproctype kogitoproctype;
   @JsonProperty("kogitoprocinstanceid")
   @JsonInclude(Include.NON_NULL)
   private String kogitoprocinstanceid;
   @JsonProperty("kogitoprocist")
   @JsonInclude(Include.NON_NULL)
   private String kogitoprocist;
   @JsonProperty("kogitoprocversion")
   @JsonInclude(Include.NON_NULL)
   private String kogitoprocversion;
   @JsonProperty("kogitorootprociid")
   @JsonInclude(Include.NON_NULL)
   private String kogitorootprociid;
   @JsonProperty("kogitoprocid")
   @JsonInclude(Include.NON_NULL)
   private String kogitoprocid;
   @JsonProperty("kogitoprocrefid")
   @JsonInclude(Include.NON_NULL)
   private String kogitoprocrefid;
   @JsonProperty(required = true)
   private RegelRequestMessagePayloadData data;
   @JsonAnySetter
   @JsonInclude(Include.NON_NULL)
   private HashMap<String, Object> additionalProperties;

   public RegelRequestMessagePayload()
   {
   }

   public SpecVersion getSpecversion()
   {
      return this.specversion;
   }

   public void setSpecversion(SpecVersion specversion)
   {
      this.specversion = specversion;
   }

   public String getId()
   {
      return this.id;
   }

   public void setId(String id)
   {
      this.id = id;
   }

   public String getSource()
   {
      return this.source;
   }

   public void setSource(String source)
   {
      this.source = source;
   }

   public String getType()
   {
      return this.type;
   }

   public void setType(String type)
   {
      this.type = type;
   }

   public OffsetDateTime getTime()
   {
      return this.time;
   }

   public void setTime(OffsetDateTime time)
   {
      this.time = time;
   }

   public String getKogitoparentprociid()
   {
      return this.kogitoparentprociid;
   }

   public void setKogitoparentprociid(String kogitoparentprociid)
   {
      this.kogitoparentprociid = kogitoparentprociid;
   }

   public String getKogitorootprocid()
   {
      return this.kogitorootprocid;
   }

   public void setKogitorootprocid(String kogitorootprocid)
   {
      this.kogitorootprocid = kogitorootprocid;
   }

   public Kogitoproctype getKogitoproctype()
   {
      return this.kogitoproctype;
   }

   public void setKogitoproctype(Kogitoproctype kogitoproctype)
   {
      this.kogitoproctype = kogitoproctype;
   }

   public String getKogitoprocinstanceid()
   {
      return this.kogitoprocinstanceid;
   }

   public void setKogitoprocinstanceid(String kogitoprocinstanceid)
   {
      this.kogitoprocinstanceid = kogitoprocinstanceid;
   }

   public String getKogitoprocist()
   {
      return this.kogitoprocist;
   }

   public void setKogitoprocist(String kogitoprocist)
   {
      this.kogitoprocist = kogitoprocist;
   }

   public String getKogitoprocversion()
   {
      return this.kogitoprocversion;
   }

   public void setKogitoprocversion(String kogitoprocversion)
   {
      this.kogitoprocversion = kogitoprocversion;
   }

   public String getKogitorootprociid()
   {
      return this.kogitorootprociid;
   }

   public void setKogitorootprociid(String kogitorootprociid)
   {
      this.kogitorootprociid = kogitorootprociid;
   }

   public String getKogitoprocid()
   {
      return this.kogitoprocid;
   }

   public void setKogitoprocid(String kogitoprocid)
   {
      this.kogitoprocid = kogitoprocid;
   }

   public String getKogitoprocrefid()
   {
      return this.kogitoprocrefid;
   }

   public void setKogitoprocrefid(String kogitoprocrefid)
   {
      this.kogitoprocrefid = kogitoprocrefid;
   }

   public RegelRequestMessagePayloadData getData()
   {
      return this.data;
   }

   public void setData(RegelRequestMessagePayloadData data)
   {
      this.data = data;
   }

   @JsonAnyGetter
   public HashMap<String, Object> getAdditionalProperties()
   {
      return this.additionalProperties;
   }

   public void setAdditionalProperties(HashMap<String, Object> additionalProperties)
   {
      this.additionalProperties = additionalProperties;
   }

   public boolean equals(Object o)
   {
      if (this == o)
      {
         return true;
      }
      else if (o != null && this.getClass() == o.getClass())
      {
         RegelRequestMessagePayload self = (RegelRequestMessagePayload) o;
         return Objects.equals(this.specversion, self.specversion) && Objects.equals(this.id, self.id)
               && Objects.equals(this.source, self.source) && Objects.equals(this.type, self.type)
               && Objects.equals(this.time, self.time) && Objects.equals(this.kogitoparentprociid, self.kogitoparentprociid)
               && Objects.equals(this.kogitorootprocid, self.kogitorootprocid)
               && Objects.equals(this.kogitoproctype, self.kogitoproctype)
               && Objects.equals(this.kogitoprocinstanceid, self.kogitoprocinstanceid)
               && Objects.equals(this.kogitoprocist, self.kogitoprocist)
               && Objects.equals(this.kogitoprocversion, self.kogitoprocversion)
               && Objects.equals(this.kogitorootprociid, self.kogitorootprociid)
               && Objects.equals(this.kogitoprocid, self.kogitoprocid)
               && Objects.equals(this.kogitoprocrefid, self.kogitoprocrefid) && Objects.equals(this.data, self.data)
               && Objects.equals(this.additionalProperties, self.additionalProperties);
      }
      else
      {
         return false;
      }
   }

   public int hashCode()
   {
      return Objects.hash(new Object[]
      {
            this.specversion, this.id, this.source, this.type, this.time, this.kogitoparentprociid, this.kogitorootprocid,
            this.kogitoproctype, this.kogitoprocinstanceid, this.kogitoprocist, this.kogitoprocversion, this.kogitorootprociid,
            this.kogitoprocid, this.kogitoprocrefid, this.data, this.additionalProperties
      });
   }

   public String toString()
   {
      return "class RegelRequestMessagePayload {\n    specversion: " + this.toIndentedString(this.specversion) + "\n    id: "
            + this.toIndentedString(this.id) + "\n    source: " + this.toIndentedString(this.source) + "\n    type: "
            + this.toIndentedString(this.type) + "\n    time: " + this.toIndentedString(this.time) + "\n    kogitoparentprociid: "
            + this.toIndentedString(this.kogitoparentprociid) + "\n    kogitorootprocid: "
            + this.toIndentedString(this.kogitorootprocid) + "\n    kogitoproctype: " + this.toIndentedString(this.kogitoproctype)
            + "\n    kogitoprocinstanceid: " + this.toIndentedString(this.kogitoprocinstanceid) + "\n    kogitoprocist: "
            + this.toIndentedString(this.kogitoprocist) + "\n    kogitoprocversion: "
            + this.toIndentedString(this.kogitoprocversion) + "\n    kogitorootprociid: "
            + this.toIndentedString(this.kogitorootprociid) + "\n    kogitoprocid: " + this.toIndentedString(this.kogitoprocid)
            + "\n    kogitoprocrefid: " + this.toIndentedString(this.kogitoprocrefid) + "\n    data: "
            + this.toIndentedString(this.data) + "\n    additionalProperties: " + this.toIndentedString(this.additionalProperties)
            + "\n}";
   }

   private String toIndentedString(Object o)
   {
      return o == null ? "null" : o.toString().replace("\n", "\n    ");
   }
}
