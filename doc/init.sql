CREATE TABLE "check_order"
(
    "check_order_id"     serial4,
    "check_id"           int4 NOT NULL,
    "stock_order_id"     int4 NOT NULL,
    "stock_order_number" varchar(32),
    "check_count"        int4,
    "check_status"       int2,
    "create_time"        timestamp,
    "create_by"          int4,
    "update_time"        timestamp,
    "update_by"          int4,
    "deleted"            int2,
    PRIMARY KEY ("check_order_id")
);
COMMENT
ON COLUMN "check_order"."check_order_id" IS '主键';
COMMENT
ON COLUMN "check_order"."check_id" IS '关联的盘点id';
COMMENT
ON COLUMN "check_order"."stock_order_id" IS '订单id';
COMMENT
ON COLUMN "check_order"."stock_order_number" IS '订单号';
COMMENT
ON COLUMN "check_order"."check_count" IS '盘点商品数量';
COMMENT
ON COLUMN "check_order"."check_status" IS '盘点状态';
COMMENT
ON COLUMN "check_order"."create_time" IS '创建时间';
COMMENT
ON COLUMN "check_order"."create_by" IS '创建人';
COMMENT
ON COLUMN "check_order"."update_time" IS '更新时间';
COMMENT
ON COLUMN "check_order"."update_by" IS '更新人';
COMMENT
ON COLUMN "check_order"."deleted" IS '逻辑删除标识';
