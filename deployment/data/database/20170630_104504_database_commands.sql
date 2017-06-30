ALTER TABLE "cassandra$resultobject" RENAME TO "bf9bd5a529324a76b713979f162d8ad9";
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '9efa2eb2-04bb-494f-8405-1f0bdb6b88ad';
DELETE FROM "mendixsystem$entityidentifier" 
 WHERE "id" = '9efa2eb2-04bb-494f-8405-1f0bdb6b88ad';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '9efa2eb2-04bb-494f-8405-1f0bdb6b88ad');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '9efa2eb2-04bb-494f-8405-1f0bdb6b88ad';
DROP TABLE "bf9bd5a529324a76b713979f162d8ad9";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20170630 10:45:01';
