package org.brewchain.cwv.dbgens.game.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import java.util.Map;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGame;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGameExample.Criteria;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGameExample.Criterion;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGameExample;

public class CWVGamePropertyGameSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Mon Jun 11 21:03:55 CST 2018
     */
    public String countByExample(CWVGamePropertyGameExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("cwv_game_property_game");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Mon Jun 11 21:03:55 CST 2018
     */
    public String deleteByExample(CWVGamePropertyGameExample example) {
        BEGIN();
        DELETE_FROM("cwv_game_property_game");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Mon Jun 11 21:03:55 CST 2018
     */
    public String insertSelective(CWVGamePropertyGame record) {
        BEGIN();
        INSERT_INTO("cwv_game_property_game");
        
        if (record.getGameId() != null) {
            VALUES("game_id", "#{gameId,jdbcType=INTEGER}");
        }
        
        if (record.getPropertyId() != null) {
            VALUES("property_id", "#{propertyId,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            VALUES("type", "#{type,jdbcType=SMALLINT}");
        }
        
        if (record.getInvokeGame() != null) {
            VALUES("invoke_game", "#{invokeGame,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayersCount() != null) {
            VALUES("players_count", "#{playersCount,jdbcType=INTEGER}");
        }
        
        if (record.getDevelopersCount() != null) {
            VALUES("developers_count", "#{developersCount,jdbcType=INTEGER}");
        }
        
        if (record.getInstructions() != null) {
            VALUES("instructions", "#{instructions,jdbcType=VARCHAR}");
        }
        
        if (record.getImages() != null) {
            VALUES("images", "#{images,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Mon Jun 11 21:03:55 CST 2018
     */
    public String selectByExample(CWVGamePropertyGameExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("game_id");
        } else {
            SELECT("game_id");
        }
        SELECT("property_id");
        SELECT("name");
        SELECT("type");
        SELECT("invoke_game");
        SELECT("players_count");
        SELECT("developers_count");
        SELECT("instructions");
        SELECT("images");
        SELECT("status");
        FROM("cwv_game_property_game");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        if(example!=null&&example.getSelectCols()!=null&&example.getSelectCols().trim().length()>0){
		BEGIN();
		if (example != null && example.isDistinct()) {
			SELECT_DISTINCT(example.getSelectCols());
		} else {
				SELECT(example.getSelectCols());
		}
				FROM("cwv_game_property_game");				applyWhere(example, false);
		}
        if(example != null){
            if(example.getLimit() !=  Integer.MAX_VALUE && example.getOffset() >=0 ){
                String retstr= SQL().concat(" limit "+example.getOffset()+","+example.getLimit());
                if(example.isForUpdate()) { return retstr+"  FOR UPDATE " ;} else { return retstr;}}
                else if(example.isForUpdate()){  return SQL()+"  FOR UPDATE " ;  }
            }
            return SQL();
        }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Mon Jun 11 21:03:55 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CWVGamePropertyGame record = (CWVGamePropertyGame) parameter.get("record");
        CWVGamePropertyGameExample example = (CWVGamePropertyGameExample) parameter.get("example");
        
        BEGIN();
        UPDATE("cwv_game_property_game");
        
        if (record.getGameId() != null) {
            SET("game_id = #{record.gameId,jdbcType=INTEGER}");
        }
        
        if (record.getPropertyId() != null) {
            SET("property_id = #{record.propertyId,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            SET("type = #{record.type,jdbcType=SMALLINT}");
        }
        
        if (record.getInvokeGame() != null) {
            SET("invoke_game = #{record.invokeGame,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayersCount() != null) {
            SET("players_count = #{record.playersCount,jdbcType=INTEGER}");
        }
        
        if (record.getDevelopersCount() != null) {
            SET("developers_count = #{record.developersCount,jdbcType=INTEGER}");
        }
        
        if (record.getInstructions() != null) {
            SET("instructions = #{record.instructions,jdbcType=VARCHAR}");
        }
        
        if (record.getImages() != null) {
            SET("images = #{record.images,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Mon Jun 11 21:03:55 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("cwv_game_property_game");
        
        SET("game_id = #{record.gameId,jdbcType=INTEGER}");
        SET("property_id = #{record.propertyId,jdbcType=INTEGER}");
        SET("name = #{record.name,jdbcType=VARCHAR}");
        SET("type = #{record.type,jdbcType=SMALLINT}");
        SET("invoke_game = #{record.invokeGame,jdbcType=VARCHAR}");
        SET("players_count = #{record.playersCount,jdbcType=INTEGER}");
        SET("developers_count = #{record.developersCount,jdbcType=INTEGER}");
        SET("instructions = #{record.instructions,jdbcType=VARCHAR}");
        SET("images = #{record.images,jdbcType=VARCHAR}");
        SET("status = #{record.status,jdbcType=TINYINT}");
        
        CWVGamePropertyGameExample example = (CWVGamePropertyGameExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Mon Jun 11 21:03:55 CST 2018
     */
    public String updateByPrimaryKeySelective(CWVGamePropertyGame record) {
        BEGIN();
        UPDATE("cwv_game_property_game");
        
        if (record.getPropertyId() != null) {
            SET("property_id = #{propertyId,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            SET("type = #{type,jdbcType=SMALLINT}");
        }
        
        if (record.getInvokeGame() != null) {
            SET("invoke_game = #{invokeGame,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayersCount() != null) {
            SET("players_count = #{playersCount,jdbcType=INTEGER}");
        }
        
        if (record.getDevelopersCount() != null) {
            SET("developers_count = #{developersCount,jdbcType=INTEGER}");
        }
        
        if (record.getInstructions() != null) {
            SET("instructions = #{instructions,jdbcType=VARCHAR}");
        }
        
        if (record.getImages() != null) {
            SET("images = #{images,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=TINYINT}");
        }
        
        WHERE("game_id = #{gameId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Mon Jun 11 21:03:55 CST 2018
     */
    protected void applyWhere(CWVGamePropertyGameExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}