/**
 * This class is generated by jOOQ
 */
package com.common.generated.tables;


import com.common.generated.Recruit;
import com.common.generated.tables.records.DistributedTaskDataBakRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DistributedTaskDataBak extends TableImpl<DistributedTaskDataBakRecord> {

	private static final long serialVersionUID = -2077009688;

	/**
	 * The reference instance of <code>recruit.distributed_task_data_bak</code>
	 */
	public static final DistributedTaskDataBak DISTRIBUTED_TASK_DATA_BAK = new DistributedTaskDataBak();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DistributedTaskDataBakRecord> getRecordType() {
		return DistributedTaskDataBakRecord.class;
	}

	/**
	 * The column <code>recruit.distributed_task_data_bak.id</code>. 主键
	 */
	public final TableField<DistributedTaskDataBakRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");

	/**
	 * The column <code>recruit.distributed_task_data_bak.business_type</code>. 业务类型
	 */
	public final TableField<DistributedTaskDataBakRecord, Byte> BUSINESS_TYPE = createField("business_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "业务类型");

	/**
	 * The column <code>recruit.distributed_task_data_bak.business_id</code>. 业务id
	 */
	public final TableField<DistributedTaskDataBakRecord, Long> BUSINESS_ID = createField("business_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "业务id");

	/**
	 * The column <code>recruit.distributed_task_data_bak.status</code>. 0:默认(未处理),1:已被获取,2:正常完成,3:异常
	 */
	public final TableField<DistributedTaskDataBakRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "0:默认(未处理),1:已被获取,2:正常完成,3:异常");

	/**
	 * The column <code>recruit.distributed_task_data_bak.create_time</code>. 创建时间
	 */
	public final TableField<DistributedTaskDataBakRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>recruit.distributed_task_data_bak.next_send_time</code>. 下个执行时间
	 */
	public final TableField<DistributedTaskDataBakRecord, Timestamp> NEXT_SEND_TIME = createField("next_send_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "下个执行时间");

	/**
	 * The column <code>recruit.distributed_task_data_bak.exe_num</code>. 执行次数
	 */
	public final TableField<DistributedTaskDataBakRecord, Integer> EXE_NUM = createField("exe_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "执行次数");

	/**
	 * The column <code>recruit.distributed_task_data_bak.update_time</code>. 修改时间
	 */
	public final TableField<DistributedTaskDataBakRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "修改时间");

	/**
	 * The column <code>recruit.distributed_task_data_bak.ack_time</code>. ack时间
	 */
	public final TableField<DistributedTaskDataBakRecord, Timestamp> ACK_TIME = createField("ack_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "ack时间");

	/**
	 * The column <code>recruit.distributed_task_data_bak.exception_text</code>. 异常信息
	 */
	public final TableField<DistributedTaskDataBakRecord, String> EXCEPTION_TEXT = createField("exception_text", org.jooq.impl.SQLDataType.CLOB, this, "异常信息");

	/**
	 * The column <code>recruit.distributed_task_data_bak.backup_time</code>. 备份时间
	 */
	public final TableField<DistributedTaskDataBakRecord, Timestamp> BACKUP_TIME = createField("backup_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "备份时间");

	/**
	 * The column <code>recruit.distributed_task_data_bak.ip</code>. ip地址
	 */
	public final TableField<DistributedTaskDataBakRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaulted(true), this, "ip地址");

	/**
	 * Create a <code>recruit.distributed_task_data_bak</code> table reference
	 */
	public DistributedTaskDataBak() {
		this("distributed_task_data_bak", null);
	}

	/**
	 * Create an aliased <code>recruit.distributed_task_data_bak</code> table reference
	 */
	public DistributedTaskDataBak(String alias) {
		this(alias, DISTRIBUTED_TASK_DATA_BAK);
	}

	private DistributedTaskDataBak(String alias, Table<DistributedTaskDataBakRecord> aliased) {
		this(alias, aliased, null);
	}

	private DistributedTaskDataBak(String alias, Table<DistributedTaskDataBakRecord> aliased, Field<?>[] parameters) {
		super(alias, Recruit.RECRUIT, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataBak as(String alias) {
		return new DistributedTaskDataBak(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DistributedTaskDataBak rename(String name) {
		return new DistributedTaskDataBak(name, null);
	}
}