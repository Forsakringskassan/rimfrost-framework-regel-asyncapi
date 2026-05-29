// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package se.fk.rimfrost.framework.regel;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Map;
import java.util.Objects;

import java.io.Serializable;
import java.util.HashMap;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings("EI_EXPOSE_REP")
public class RegelResponseMessagePayloadData implements Serializable
{
   private static final long serialVersionUID = 1L;
   @JsonProperty(required = true)
   private String handlaggningId;
   @JsonProperty(required = true)
   private Utfall utfall;
   @JsonProperty("error")
   @JsonInclude(Include.NON_NULL)
   private RegelErrorInformation error;
   @JsonAnySetter
   @JsonInclude(Include.NON_NULL)
   private HashMap<String, Object> additionalProperties;

   public RegelResponseMessagePayloadData()
   {
   }

   public String getHandlaggningId()
   {
      return this.handlaggningId;
   }

   public void setHandlaggningId(String handlaggningId)
   {
      this.handlaggningId = handlaggningId;
   }

   public Utfall getUtfall()
   {
      return this.utfall;
   }

   public void setUtfall(Utfall utfall)
   {
      this.utfall = utfall;
   }

   public RegelErrorInformation getError()
   {
      return this.error;
   }

   public void setError(RegelErrorInformation error)
   {
      this.error = error;
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
         RegelResponseMessagePayloadData self = (RegelResponseMessagePayloadData) o;
         return Objects.equals(this.handlaggningId, self.handlaggningId) && Objects.equals(this.utfall, self.utfall)
               && Objects.equals(this.error, self.error) && Objects.equals(this.additionalProperties, self.additionalProperties);
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
            this.handlaggningId, this.utfall, this.error, this.additionalProperties
      });
   }

   public String toString()
   {
      return "class RegelResponseMessagePayloadData {\n    handlaggningId: " + this.toIndentedString(this.handlaggningId)
            + "\n    utfall: " + this.toIndentedString(this.utfall) + "\n    error: " + this.toIndentedString(this.error)
            + "\n    additionalProperties: " + this.toIndentedString(this.additionalProperties) + "\n}";
   }

   private String toIndentedString(Object o)
   {
      return o == null ? "null" : o.toString().replace("\n", "\n    ");
   }
}
