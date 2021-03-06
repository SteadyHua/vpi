package press.whcj.ams.service;

import press.whcj.ams.entity.ProjectGroup;
import press.whcj.ams.entity.dto.ProjectDto;
import press.whcj.ams.entity.vo.ProjectGroupVo;
import press.whcj.ams.entity.vo.UserVo;

import java.util.List;

/**
 * @author xyyxhcj@qq.com
 * @since 2019/12/31
 */

public interface ProjectGroupService {
	String save(ProjectGroup projectGroupDto, UserVo operator);

	List<ProjectGroupVo> findList(ProjectGroup projectGroupDto, UserVo operator);

	ProjectGroupVo findDetail(ProjectGroup projectGroup);

	void delete(ProjectGroup projectGroup);

	List<ProjectGroupVo> findListByParentForOwner(ProjectGroup projectGroupDto, UserVo operator);

	List<ProjectGroupVo> findListByParentForOther(ProjectGroup projectGroupDto, UserVo operator);

	/**
	 * move project&group to other group
	 * @param projectDto projectDto
	 * @param operator operator
	 */
	void moveGroup(ProjectDto projectDto, UserVo operator);
}
