// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.redacted_test.RedactedOneOf in redacted_one_of.proto
package com.squareup.wire.protos.kotlin.redacted

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.countNonNull
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.hashCode
import kotlin.jvm.JvmField
import kotlin.jvm.JvmOverloads
import okio.ByteString

public class RedactedOneOf @JvmOverloads constructor(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  @JvmField
  public val b: Int? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    redacted = true
  )
  @JvmField
  public val c: String? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<RedactedOneOf, RedactedOneOf.Builder>(ADAPTER, unknownFields) {
  init {
    require(countNonNull(b, c) <= 1) {
      "At most one of b, c may be non-null"
    }
  }

  public override fun newBuilder(): Builder {
    val builder = Builder()
    builder.b = b
    builder.c = c
    builder.addUnknownFields(unknownFields)
    return builder
  }

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RedactedOneOf) return false
    if (unknownFields != other.unknownFields) return false
    if (b != other.b) return false
    if (c != other.c) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + b.hashCode()
      result = result * 37 + c.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (b != null) result += """b=$b"""
    if (c != null) result += """c=██"""
    return result.joinToString(prefix = "RedactedOneOf{", separator = ", ", postfix = "}")
  }

  public fun copy(
    b: Int? = this.b,
    c: String? = this.c,
    unknownFields: ByteString = this.unknownFields
  ): RedactedOneOf = RedactedOneOf(b, c, unknownFields)

  public class Builder : Message.Builder<RedactedOneOf, Builder>() {
    @JvmField
    public var b: Int? = null

    @JvmField
    public var c: String? = null

    public fun b(b: Int?): Builder {
      this.b = b
      this.c = null
      return this
    }

    public fun c(c: String?): Builder {
      this.c = c
      this.b = null
      return this
    }

    public override fun build(): RedactedOneOf = RedactedOneOf(
      b = b,
      c = c,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<RedactedOneOf> = object : ProtoAdapter<RedactedOneOf>(
      FieldEncoding.LENGTH_DELIMITED, 
      RedactedOneOf::class, 
      "type.googleapis.com/squareup.protos.kotlin.redacted_test.RedactedOneOf", 
      PROTO_2, 
      null
    ) {
      public override fun encodedSize(value: RedactedOneOf): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.b)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.c)
        return size
      }

      public override fun encode(writer: ProtoWriter, value: RedactedOneOf): Unit {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.b)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.c)
        writer.writeBytes(value.unknownFields)
      }

      public override fun decode(reader: ProtoReader): RedactedOneOf {
        var b: Int? = null
        var c: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> b = ProtoAdapter.INT32.decode(reader)
            2 -> c = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return RedactedOneOf(
          b = b,
          c = c,
          unknownFields = unknownFields
        )
      }

      public override fun redact(value: RedactedOneOf): RedactedOneOf = value.copy(
        c = null,
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
