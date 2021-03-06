import * as DataLocation from 'core/shared/models/Versioning/DataLocation';
import { defaultBranch } from 'core/shared/models/Versioning/RepositoryData';
import routes from 'routes';

import { ICommitHistorySettings } from '../store/types';

const parseCommitsHistorySettings = (location: {
  pathname: string;
  search: string;
}): ICommitHistorySettings => {
  const match = routes.repositoryCommitsHistory.getMatch(location.pathname);
  const params = routes.repositoryCommitsHistory.parseQueryParams(
    location.search
  );
  return {
    branch: match ? match.commitPointerValue : defaultBranch,
    currentPage: params && params.page ? Number(params.page) - 1 : 0,
    location:
      match && match.locationPathname
        ? DataLocation.makeFromPathname(match.locationPathname)
        : DataLocation.makeRoot(),
  };
};

export default parseCommitsHistorySettings;
