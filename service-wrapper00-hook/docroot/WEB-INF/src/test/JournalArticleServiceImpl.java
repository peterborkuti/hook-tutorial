package test;

import java.io.File;
import java.util.Locale;
import java.util.Map;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.journal.ArticleContentSizeException;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.service.JournalArticleService;
import com.liferay.portlet.journal.service.JournalArticleServiceWrapper;

public class JournalArticleServiceImpl extends JournalArticleServiceWrapper {

	public JournalArticleServiceImpl(JournalArticleService journalArticleService) {
		super(journalArticleService);
	}

	@Override
	public JournalArticle addArticle(long groupId, long folderId, long classNameId, long classPK, String articleId,
			boolean autoArticleId, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, String content,
			String type, String ddmStructureKey, String ddmTemplateKey, String layoutUuid, int displayDateMonth,
			int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute,
			int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire, int reviewDateMonth, int reviewDateDay, int reviewDateYear,
			int reviewDateHour, int reviewDateMinute, boolean neverReview, boolean indexable, boolean smallImage,
			String smallImageURL, File smallFile, Map<String, byte[]> images, String articleURL,
			ServiceContext serviceContext) throws PortalException, SystemException {

		throw new ArticleContentSizeException();

		/*
		return super.addArticle(groupId, folderId, classNameId, classPK, articleId, autoArticleId, titleMap, descriptionMap,
				content, type, ddmStructureKey, ddmTemplateKey, layoutUuid, displayDateMonth, displayDateDay, displayDateYear,
				displayDateHour, displayDateMinute, expirationDateMonth, expirationDateDay, expirationDateYear,
				expirationDateHour, expirationDateMinute, neverExpire, reviewDateMonth, reviewDateDay, reviewDateYear,
				reviewDateHour, reviewDateMinute, neverReview, indexable, smallImage, smallImageURL, smallFile, images,
				articleURL, serviceContext);
		*/
	}

	@Override
	public JournalArticle addArticle(long groupId, long folderId, long classNameId, long classPK, String articleId,
			boolean autoArticleId, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, String content,
			String type, String ddmStructureKey, String ddmTemplateKey, String layoutUuid, int displayDateMonth,
			int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute,
			int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire, int reviewDateMonth, int reviewDateDay, int reviewDateYear,
			int reviewDateHour, int reviewDateMinute, boolean neverReview, boolean indexable, String articleURL,
			ServiceContext serviceContext) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return super.addArticle(groupId, folderId, classNameId, classPK, articleId, autoArticleId, titleMap, descriptionMap,
				content, type, ddmStructureKey, ddmTemplateKey, layoutUuid, displayDateMonth, displayDateDay, displayDateYear,
				displayDateHour, displayDateMinute, expirationDateMonth, expirationDateDay, expirationDateYear,
				expirationDateHour, expirationDateMinute, neverExpire, reviewDateMonth, reviewDateDay, reviewDateYear,
				reviewDateHour, reviewDateMinute, neverReview, indexable, articleURL, serviceContext);
	}
}
