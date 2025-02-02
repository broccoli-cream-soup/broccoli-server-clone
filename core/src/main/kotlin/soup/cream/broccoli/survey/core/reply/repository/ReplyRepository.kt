package soup.cream.broccoli.survey.core.reply.repository

import soup.cream.broccoli.survey.core.reply.entity.Reply
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface ReplyRepository : MongoRepository<Reply, ObjectId> {
    fun findRepliesByUserIdIs(userId: Long): List<Reply>
    fun existsReplyByUserIdAndSurveyId(userId: Long, surveyId: ObjectId): Boolean
}
