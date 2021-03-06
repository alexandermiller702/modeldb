// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.swagger._public.modeldb.versioning.model

import scala.util.Try

import net.liftweb.json._

import ai.verta.swagger._public.modeldb.versioning.model.ArtifactTypeEnumArtifactType._
import ai.verta.swagger._public.modeldb.versioning.model.DiffStatusEnumDiffStatus._
import ai.verta.swagger._public.modeldb.versioning.model.TernaryEnumTernary._
import ai.verta.swagger._public.modeldb.versioning.model.ValueTypeEnumValueType._
import ai.verta.swagger._public.modeldb.versioning.model.WorkspaceTypeEnumWorkspaceType._
import ai.verta.swagger._public.modeldb.versioning.model.ProtobufNullValue._
import ai.verta.swagger.client.objects._

case class VersioningMergeRepositoryCommitsRequest (
  repository_id: Option[VersioningRepositoryIdentification] = None,
  commit_sha_a: Option[String] = None,
  commit_sha_b: Option[String] = None,
  content: Option[VersioningCommit] = None
) extends BaseSwagger {
  def toJson(): JValue = VersioningMergeRepositoryCommitsRequest.toJson(this)
}

object VersioningMergeRepositoryCommitsRequest {
  def toJson(obj: VersioningMergeRepositoryCommitsRequest): JObject = {
    new JObject(
      List[Option[JField]](
        obj.repository_id.map(x => JField("repository_id", ((x: VersioningRepositoryIdentification) => VersioningRepositoryIdentification.toJson(x))(x))),
        obj.commit_sha_a.map(x => JField("commit_sha_a", JString(x))),
        obj.commit_sha_b.map(x => JField("commit_sha_b", JString(x))),
        obj.content.map(x => JField("content", ((x: VersioningCommit) => VersioningCommit.toJson(x))(x)))
      ).flatMap(x => x match {
        case Some(y) => List(y)
        case None => Nil
      })
    )
  }

  def fromJson(value: JValue): VersioningMergeRepositoryCommitsRequest =
    value match {
      case JObject(fields) => {
        val fieldsMap = fields.map(f => (f.name, f.value)).toMap
        VersioningMergeRepositoryCommitsRequest(
          // TODO: handle required
          repository_id = fieldsMap.get("repository_id").map(VersioningRepositoryIdentification.fromJson),
          commit_sha_a = fieldsMap.get("commit_sha_a").map(JsonConverter.fromJsonString),
          commit_sha_b = fieldsMap.get("commit_sha_b").map(JsonConverter.fromJsonString),
          content = fieldsMap.get("content").map(VersioningCommit.fromJson)
        )
      }
      case _ => throw new IllegalArgumentException(s"unknown type ${value.getClass.toString}")
    }
}
